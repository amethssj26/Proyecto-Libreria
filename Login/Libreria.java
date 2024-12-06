import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class Libreria extends JFrame {
    private JTextField usuarioField;
    private JPasswordField passwordField;
    private Clip musicClip;
    private boolean isMusicPlaying = true;

    public Libreria() {
        setTitle("Bienvenido a la Librería");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Fondo
        BackgroundPanel backgroundPanel = new BackgroundPanel("C:/Users/johan/OneDrive/Desktop/Java/Recursos/Imágenes/Login.png");
        setContentPane(backgroundPanel);
        backgroundPanel.setLayout(new BorderLayout());

        // Botón de retroceder
        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        northPanel.setOpaque(false);
        JButton backButton = new JButton("← Retroceder");
        backButton.addActionListener(e -> dispose());
        northPanel.add(backButton);
        backgroundPanel.add(northPanel, BorderLayout.NORTH);

        // Botón de parar música
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        southPanel.setOpaque(false);
        JButton toggleMusicButton = new JButton("Parar Música");
        toggleMusicButton.addActionListener(e -> toggleMusic(toggleMusicButton));
        southPanel.add(toggleMusicButton);
        backgroundPanel.add(southPanel, BorderLayout.SOUTH);

        // Inicio de sesión
        JPanel loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        loginPanel.add(new JLabel("Usuario:"), gbc);

        gbc.gridx = 1;
        usuarioField = new JTextField(15);
        loginPanel.add(usuarioField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        loginPanel.add(new JLabel("Contraseña:"), gbc);

        gbc.gridx = 1;
        passwordField = new JPasswordField(15);
        loginPanel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.addActionListener(new LoginAction());
        loginPanel.add(loginButton, gbc);

        gbc.gridy = 3;
        JButton registerButton = new JButton("Crear Cuenta");
        registerButton.addActionListener(e -> new RegistroFrame());
        loginPanel.add(registerButton, gbc);

        backgroundPanel.add(loginPanel, BorderLayout.CENTER);

        // Iniciar música
        playMusic("C:/Users/johan/OneDrive/Desktop/Java/Recursos/Audio/Song of the Ancients.wav");

        setVisible(true);
    }

    private void playMusic(String filePath) {
        try {
            musicClip = AudioSystem.getClip();
            musicClip.open(AudioSystem.getAudioInputStream(new File(filePath)));
            musicClip.start();
            musicClip.loop(Clip.LOOP_CONTINUOUSLY);
            isMusicPlaying = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void toggleMusic(JButton toggleButton) {
        if (isMusicPlaying) {
            musicClip.stop();
            toggleButton.setText("Reanudar Música");
            isMusicPlaying = false;
        } else {
            musicClip.start();
            toggleButton.setText("Parar Música");
            isMusicPlaying = true;
        }
    }

    private class LoginAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String usuario = usuarioField.getText(); // Obtener el usuario ingresado
            String password = new String(passwordField.getPassword()); // Obtener la contraseña ingresada
    
            // Verificar credenciales usando el método estático
            if (ControladorUsuarios.verificarLogin(usuario, password)) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
    
                // Cerrar la ventana de login
                dispose();
    
                // Abrir la ventana principal (Home)
                DigitalLibraryHome home = new DigitalLibraryHome(usuario); // Pasar el usuario al Home
                home.setVisible(true); // Hacer visible la ventana del Home
            } else {
                // Mostrar mensaje de error si las credenciales son incorrectas
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Intenta nuevamente.");
            }
        }
    }
    

    public static class Conexion {
        private static final String URL = "jdbc:mysql://localhost:3306/ProjectoL";
        private static final String USER = "root";
        private static final String PASSWORD = "12345";

        public static Connection getConnection() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); // Registro del driver
                return DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (ClassNotFoundException e) {
                System.err.println("Driver de MySQL no encontrado.");
                e.printStackTrace();
                return null;
            } catch (SQLException e) {
                System.err.println("Error en la conexión a la base de datos.");
                e.printStackTrace();
                return null;
            }
        }
    }

    public static class ControladorUsuarios {
        public static boolean registrarUsuario(String usuario, String password) {
            String query = "INSERT INTO usuarios (usuario, contraseña) VALUES (?, ?)";
            try (Connection connection = Conexion.getConnection();
                 PreparedStatement statement = connection.prepareStatement(query)) {
                if (connection == null) {
                    return false;
                }
                statement.setString(1, usuario);
                statement.setString(2, password);
                statement.executeUpdate();
                return true;
            } catch (SQLException e) {
                System.err.println("Error al registrar usuario.");
                e.printStackTrace();
                return false;
            }
        }

        public static boolean verificarLogin(String usuario, String password) {
            String query = "SELECT * FROM usuarios WHERE usuario = ? AND contraseña = ?";
            try (Connection connection = Conexion.getConnection();
                 PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, usuario);
                statement.setString(2, password);
                try (ResultSet resultSet = statement.executeQuery()) {
                    return resultSet.next();
                }
            } catch (SQLException e) {
                System.err.println("Error en la verificación de login.");
                e.printStackTrace();
                return false;
            }
        }
    }

    // Clase RegistroFrame
    public static class RegistroFrame extends JFrame {
        public RegistroFrame() {
            setTitle("Registro de Usuario");
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLayout(new GridLayout(3, 2));

            add(new JLabel("Usuario:"));
            JTextField usuarioField = new JTextField();
            add(usuarioField);

            add(new JLabel("Contraseña:"));
            JPasswordField passwordField = new JPasswordField();
            add(passwordField);

            JButton registrarButton = new JButton("Registrar");
            registrarButton.addActionListener(e -> {
                String usuario = usuarioField.getText();
                String password = new String(passwordField.getPassword());
                if (ControladorUsuarios.registrarUsuario(usuario, password)) {
                    JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al registrar usuario");
                }
            });
            add(registrarButton);

            setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Libreria::new);
    }
}

// Clase BackgroundPanel (agregada para solucionar el error)
class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel(String imagePath) {
        try {
            backgroundImage = new ImageIcon(imagePath).getImage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
