package Infantil;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana1Libro {
    private JFrame ventana;

    // Constructor
    public ventana1Libro(Infantil libro) {
        ventana = new JFrame("Detalles del Libro");
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(1540, 1000);

       // Establecer el color de fondo de la ventana
       Color colorFondo = (new Color(2, 119, 189)); // Marrón oscuro
       ventana.getContentPane().setBackground(colorFondo);

       // Crear el panel principal para el contenido
       JPanel panelPrincipal = new JPanel();
       panelPrincipal.setLayout(new BorderLayout()); // Usar BorderLayout para organizar los componentes
       panelPrincipal.setBackground(colorFondo);
       panelPrincipal.setBorder(new EmptyBorder(20, 20, 20, 20));

       // Crear el panel de información del libro (arriba del TabbedPane)
       JPanel informacionPanel = new JPanel();
       informacionPanel.setLayout(new BoxLayout(informacionPanel, BoxLayout.Y_AXIS));
       informacionPanel.setBackground(colorFondo);
       informacionPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

       // Título en negrita y más grande
       Font fuenteTitulo = new Font("Times New Roman", Font.BOLD, 50);
       JLabel tituloLabel = new JLabel("<html><div style='text-align: left; color: white;'>" + libro.getTitulo() + "</div></html>");
       tituloLabel.setFont(fuenteTitulo);
       informacionPanel.add(tituloLabel);

       informacionPanel.add(Box.createVerticalStrut(10));

       JLabel descripcionLabel = new JLabel("<html><div style='text-align: left; width: 620px; color: white;'>" + libro.getDescripcion() + "</div></html>");
       descripcionLabel.setFont(new Font("Times New Roman", Font.ITALIC, 18));
       informacionPanel.add(descripcionLabel);

       informacionPanel.add(Box.createVerticalStrut(60));

       JLabel precioLabel = new JLabel("$" + libro.getPrecio() + " USD");
       precioLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
       precioLabel.setForeground(Color.WHITE);
       informacionPanel.add(precioLabel);

       informacionPanel.add(Box.createVerticalStrut(45));

       JLabel cantidadLabel = new JLabel("Cantidad en stock: " + libro.getCantidadEnStock());
       cantidadLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
       cantidadLabel.setForeground(Color.WHITE);
       informacionPanel.add(cantidadLabel);

       // Añadir la línea separadora blanca
       JSeparator separador = new JSeparator();
       separador.setForeground(Color.BLACK); // Establece el color de la línea
       informacionPanel.add(separador);

       informacionPanel.add(Box.createVerticalStrut(30));

       JLabel quedanPocosLabel = new JLabel("¡Quedan pocos!");
       quedanPocosLabel.setFont(new Font("Times New Roman", Font.ITALIC, 28));
       quedanPocosLabel.setForeground(Color.WHITE);
       informacionPanel.add(quedanPocosLabel);

       // Crear el TabbedPane
       JTabbedPane tabbedPane = new JTabbedPane();
       tabbedPane.setBackground(Color.WHITE);
       tabbedPane.setForeground(new Color(0,0,0)); // botones de detalles y resena
       Font tabFont = new Font("Times New Roman", Font.BOLD, 24);
       tabbedPane.setFont(tabFont);

       // Crear el panel de detalles del producto
       JPanel detallesProductoPanel = new JPanel();
       detallesProductoPanel.setLayout(new BoxLayout(detallesProductoPanel, BoxLayout.Y_AXIS));
       detallesProductoPanel.setBackground(colorFondo);

       // Añadir los detalles del producto con espacio cada dos líneas
       detallesProductoPanel.add(crearDetalle("Autor:", libro.getAutor()));
       detallesProductoPanel.add(Box.createVerticalStrut(5)); // Espacio

       detallesProductoPanel.add(crearDetalle("Editorial:", libro.getEditorial()));
       detallesProductoPanel.add(Box.createVerticalStrut(5)); // Espacio

       detallesProductoPanel.add(crearDetalle("Número de Páginas:", String.valueOf(libro.getNumP())));
       detallesProductoPanel.add(Box.createVerticalStrut(5)); // Espacio

       detallesProductoPanel.add(crearDetalle("Fecha de Publicación:", libro.getFechaPubli()));
       detallesProductoPanel.add(Box.createVerticalStrut(5)); // Espacio

       detallesProductoPanel.add(crearDetalle("Idioma:", libro.getIdioma()));

       // Crear el panel de reseñas
       JPanel reseñasProductoPanel = new JPanel();
       reseñasProductoPanel.setLayout(new BoxLayout(reseñasProductoPanel, BoxLayout.Y_AXIS));
       reseñasProductoPanel.setBackground(colorFondo);

       // Cambiar el color y tamaño de la fuente para las reseñas
       Font fuenteReseñas = new Font("Times New Roman", Font.ITALIC, 22); // Aumentar el tamaño de la fuente

       // Añadir las reseñas con el color y tamaño de fuente modificados
       JLabel reseña1 = new JLabel("Miguel19: ¡Una verdadera joya para los niños curiosos." + //
                       "\n" + //
                       " !");
       reseña1.setFont(fuenteReseñas);
       reseña1.setForeground(Color.WHITE);  // cambiar color a blanco 
       reseñasProductoPanel.add(reseña1);

       JLabel reseña2 = new JLabel("Antonio_L: Un libro encantador que lleva a los niños a un mundo de imaginación. ");
       reseña2.setFont(fuenteReseñas);
       reseña2.setForeground(Color.WHITE);  // Cambiar color a blanco
       reseñasProductoPanel.add(reseña2);

       // Crear un JTextArea para que el usuario escriba su reseña
       JTextArea reseñaArea = new JTextArea(4, 40); // Área de texto para la reseña
       reseñaArea.setLineWrap(true);
       reseñaArea.setWrapStyleWord(true);
       reseñaArea.setFont(new Font("Times New Roman", Font.PLAIN, 18));
       reseñaArea.setBackground(new Color(0,0,0));  //CAMPO DE RESENA 
       reseñaArea.setForeground(Color.BLACK);

       // Crear un botón para añadir la reseña
       JButton botonAñadir = new JButton("Añadir tu reseña");
       botonAñadir.setFont(new Font("Times New Roman", Font.BOLD, 18));
       botonAñadir.setBackground(new Color(255,255,255));
       botonAñadir.setForeground(Color.BLACK);

       // Acción del botón para añadir la reseña
       botonAñadir.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String nuevaReseña = reseñaArea.getText().trim();
               if (!nuevaReseña.isEmpty()) {
                   // Crear la nueva reseña y añadirla al principio del panel de reseñas
                   JLabel nuevaReseñaLabel = new JLabel("Anónimo: " + nuevaReseña);
                   nuevaReseñaLabel.setFont(fuenteReseñas);
                   nuevaReseñaLabel.setForeground(Color.WHITE);

                   // Añadir la nueva reseña en la parte superior del panel
                   reseñasProductoPanel.add(nuevaReseñaLabel, 0);  // Se usa el índice 0 para insertarla al inicio

                   reseñasProductoPanel.revalidate(); // Actualiza el panel
                   reseñasProductoPanel.repaint();    // Redibuja el panel
                   reseñaArea.setText(""); // Limpia el área de texto
               }
           }
       });

       // Añadir el área de texto y el botón al final del panel de reseñas
       JPanel reseñaPanel = new JPanel();
       reseñaPanel.setLayout(new BoxLayout(reseñaPanel, BoxLayout.Y_AXIS));
       reseñaPanel.setBackground(colorFondo);
       reseñaPanel.add(new JScrollPane(reseñaArea));
       reseñaPanel.add(botonAñadir);

       // Añadir el panel de reseñas y el panel de entrada de reseña (área de texto + botón)
       reseñasProductoPanel.add(reseñaPanel);

       tabbedPane.addTab("Detalles del Libro", detallesProductoPanel);
       tabbedPane.addTab("Reseñas", reseñasProductoPanel);

       // Panel izquierdo
       JPanel panelIzquierdo = new JPanel();
       panelIzquierdo.setLayout(new BorderLayout());
       panelIzquierdo.setBackground(colorFondo);
       panelIzquierdo.add(informacionPanel, BorderLayout.NORTH);
       panelIzquierdo.add(tabbedPane, BorderLayout.CENTER);

       // Panel derecho para mostrar la portada
       JPanel panelDerecho = new JPanel();
       panelDerecho.setLayout(new BorderLayout());
       panelDerecho.setBackground(colorFondo);

       // Redimensionar la imagen de la portada
       ImageIcon portadaImage = new ImageIcon(libro.getRutaImagenPortada());
       int anchoPortada = 550;  // Cambia este valor según lo desees
       int altoPortada = 750;  // Cambia este valor según lo desees
       Image portadaRedimensionada = portadaImage.getImage().getScaledInstance(anchoPortada, altoPortada, Image.SCALE_SMOOTH);
       ImageIcon portadaRedimensionadaIcon = new ImageIcon(portadaRedimensionada);

       JLabel portadaLabel = new JLabel(portadaRedimensionadaIcon);
       panelDerecho.add(portadaLabel, BorderLayout.CENTER); // Añadir la portada al panel derecho

       // Crear un JScrollPane para permitir el desplazamiento de toda la página
       JScrollPane scrollPane = new JScrollPane(panelPrincipal);
       ventana.getContentPane().add(scrollPane, BorderLayout.CENTER);

       // Añadir los paneles a la ventana
       panelPrincipal.add(panelIzquierdo, BorderLayout.CENTER);
       panelPrincipal.add(panelDerecho, BorderLayout.EAST);

       ventana.setVisible(true);

       // Crear el botón "Añadir a la Wishlist"
       JButton botonWishlist = new JButton("Añadir a la Wishlist");
       botonWishlist.setFont(new Font("Times New Roman", Font.BOLD, 18));
       botonWishlist.setBackground(new Color(255,255,255));
       botonWishlist.setForeground(Color.BLACK);

       // Acción del botón "Añadir a la Wishlist"
       botonWishlist.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
       // Acción a realizar cuando el botón es presionado (puedes personalizarla)
       JOptionPane.showMessageDialog(ventana, "Libro añadido a la wishlist.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
   }
});        
// Añadir el botón al panel de información del libro
informacionPanel.add(botonWishlist); 
}
   private JPanel crearDetalle(String etiqueta, String valor) {
       JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
       panel.setBackground(new Color(55,71,79)); // Azul oscuro

       JLabel etiquetaLabel = new JLabel("<html><div style='color: white;'>" + etiqueta + "</div></html>");
       etiquetaLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
       panel.add(etiquetaLabel);

       JLabel valorLabel = new JLabel("<html><div style='color: white;'>" + valor + "</div></html>");
       valorLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
       panel.add(valorLabel);

       return panel;
   }
}