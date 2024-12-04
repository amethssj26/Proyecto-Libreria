package Aventura;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class listaLibro {
    private JFrame ventana;

    // Clase estática para el fondo de la ventana
    public static class FondoPanel extends JPanel {
        private Image imagen;

        public FondoPanel(String rutaImagen) {
            imagen = new ImageIcon(rutaImagen).getImage();
            int nuevoAncho = 1500;  // Ancho manual de la imagen
            int nuevoAlto = 1000;   // Alto manual de la imagen
            imagen = imagen.getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this); // Dibujar la imagen de fondo
        }
    }

    // Constructor que acepta un arreglo de libros
    public listaLibro(aventura[] libros) {
        ventana = new JFrame("Biblioteca Virtual - Misterio y Suspenso");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(1540, 1000);
        ventana.setLayout(null); // Layout absoluto

        // Crear un JLayeredPane para manejar el orden de los componentes
        JLayeredPane layeredPane = new JLayeredPane();
        ventana.setContentPane(layeredPane); // Establecer el JLayeredPane como el contenedor principal

        // Crear y añadir el fondo para toda la ventana
        FondoPanel fondo = new FondoPanel("C:\\imagenes\\tituloA.png");
        fondo.setBounds(0, 0, 1550, 1000); // Fondo cubriendo toda la ventana
        layeredPane.add(fondo, Integer.valueOf(0)); // Añadir fondo en la capa 0 (fondo)

        // Crear un panel personalizado para los botones con imagen de fondo
        JPanel panelBotones = new FondoPanel("C:\\imagenes\\aven.jpeg");
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 45, 70)); // Centrado de botones
        int filas = (int) Math.ceil(libros.length / 4.0); // Asumiendo 4 libros por fila
        int alturaNecesaria = filas * 340 + (filas - 1) * 70; // Altura por libro más espacio entre filas
        panelBotones.setPreferredSize(new Dimension(ventana.getWidth(), alturaNecesaria)); // Ajustar el tamaño del panel de botones

        // Agregar los libros al panel
        for (aventura libro : libros) {
            // Verificar la existencia de la imagen
            File archivoImagen = new File(libro.getRutaImagenPortada());
            if (!archivoImagen.exists()) {
                System.out.println("La imagen no se encuentra en la ruta: " + libro.getRutaImagenPortada());
                continue; // Saltar este libro si no se encuentra la imagen
            }

            // Cargar la imagen del libro
            ImageIcon imagenPortada = new ImageIcon(libro.getRutaImagenPortada());
            Image img = imagenPortada.getImage();
            Image imgRedimensionada = img.getScaledInstance(200, 300, Image.SCALE_SMOOTH); // Redimensionar imagen
            imagenPortada = new ImageIcon(imgRedimensionada);

            // Crear un botón con solo la imagen
            JButton botonLibro = new JButton(imagenPortada);
            botonLibro.setPreferredSize(new Dimension(200, 300)); // Aumentar el tamaño del botón
            botonLibro.setFocusPainted(false);
            botonLibro.setContentAreaFilled(false);
            botonLibro.setBorderPainted(false);
            botonLibro.setOpaque(false);
            botonLibro.setRolloverEnabled(false); // Desactiva el cambio al pasar el cursor
            
            // Crear un JLabel para el texto con fondo semitransparente
            String tituloLibro = libro.getTitulo();
           
            // Usar HTML para centrar el texto y permitir líneas múltiples
            String textoHTML = "<html><div style='text-align: center; width: 120px; font-style: italic;'>" + tituloLibro + "</div></html>";
           
            JLabel textoLibro = new JLabel(textoHTML, JLabel.CENTER);
            textoLibro.setOpaque(true);
            textoLibro.setBackground(new Color(15, 19, 19, 150)); // Gris más oscuro con transparencia (alpha = 150)
            textoLibro.setForeground(new Color(255, 255, 255)); // Gris muy oscuro
            textoLibro.setPreferredSize(new Dimension(200, 65)); // Ajustar el tamaño del JLabel
            textoLibro.setFont(new Font("Arial", Font.PLAIN, 17)); // Fuente más pequeña para más texto

            // Crear un JPanel que combine el botón y el texto
            JPanel panelLibro = new JPanel();
            panelLibro.setLayout(new BorderLayout());
            panelLibro.setPreferredSize(new Dimension(200, 340)); // Ajustar el tamaño del panel
            panelLibro.setBackground(new Color(0, 0, 0, 0)); // Fondo transparente
        
            JPanel espacio = new JPanel();
            espacio.setPreferredSize(new Dimension(200, 5)); // Espaciador de 10px de alto
            panelLibro.add(botonLibro, BorderLayout.CENTER);  // Agregar el botón
            panelLibro.add(espacio, BorderLayout.SOUTH);      // Agregar espacio
            panelLibro.add(textoLibro, BorderLayout.SOUTH);  // Agregar el texto

            // Acción del botón
            botonLibro.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new ventanaLibro(libro);
                }
            });

            // Agregar el panel del libro al panel de botones
            panelBotones.add(panelLibro);
        }

        // Añadir el panel de botones dentro de un JScrollPane
        JScrollPane scrollPane = new JScrollPane(panelBotones); // Agregar el panelBotones dentro de un JScrollPane
        scrollPane.setBounds(0, 100, ventana.getWidth(), ventana.getHeight() - 100); // Ajustar el tamaño del scrollPane
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Siempre mostrar la barra de desplazamiento vertical

        // Añadir el JScrollPane al JLayeredPane en la capa 2
        layeredPane.add(scrollPane, Integer.valueOf(2));

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
