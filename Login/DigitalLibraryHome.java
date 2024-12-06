import java.awt.*;
import javax.swing.*;

public class DigitalLibraryHome extends JFrame {

    private JTextField searchField; // Campo de búsqueda
    private JPanel contentPanel; // Panel de contenido con libros
    // Variables globales para el carrito
private java.util.List<String> cartBooks = new java.util.ArrayList<>();
private java.util.Map<String, Double> bookPrices = new java.util.HashMap<>();
// Variable global para los libros reservados
private java.util.List<String> reservedBooks = new java.util.ArrayList<>();



    public DigitalLibraryHome() {
        // Configuración básica de la ventana
        setTitle("Librería Digital");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Paleta de colores
        Color berry = new Color(200, 90, 100);
        Color cherry = new Color(235, 100, 90);
        Color chiffon = new Color(250, 250, 245);
        Color smoke = new Color(210, 200, 205);

        // Panel superior
        JPanel topBar = new JPanel(new BorderLayout());
        topBar.setBackground(cherry);

        // Logo (esquina izquierda)
        JLabel logo = new JLabel(new ImageIcon("ruta/al/logo.png")); // Ruta del logo
        logo.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));
        topBar.add(logo, BorderLayout.WEST);

        // Barra de búsqueda
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        searchPanel.setBackground(cherry);
        searchField = new JTextField(30);
        JButton searchButton = new JButton(new ImageIcon("C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\Buscar.png"));  // Imagen de búsqueda
        searchButton.setBorderPainted(false); // Eliminar borde del botón
        searchButton.setContentAreaFilled(false); // Quitar color de fondo
        searchButton.addActionListener(e -> filterBooks());
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        topBar.add(searchPanel, BorderLayout.CENTER);

        // Botones "Home", "Wishlist", "Carrito" y "Reservados"
        JPanel rightButtons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        rightButtons.setBackground(cherry);

        // Botón Home
        JButton homeButton = new JButton(new ImageIcon("C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\Home.png")); // Imagen de Home
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.addActionListener(e -> {openUserProfile();
            // Aquí puedes implementar más acciones específicas para Home.
        });

        


        // Botón Wishlist
        JButton wishlistButton = new JButton(new ImageIcon("C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\Wishlist.png")); // Imagen de Wishlist
        wishlistButton.setBorderPainted(false);
        wishlistButton.setContentAreaFilled(false);
        wishlistButton.addActionListener(e -> {openWishlist();
            // Aquí puedes implementar más acciones específicas para Wishlist.
        });

        // Botón Carrito
        JButton cartButton = new JButton(new ImageIcon("C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\Carrito.png"));
        cartButton.setBorderPainted(false);
        cartButton.setContentAreaFilled(false);
        cartButton.addActionListener(e -> showCart());
        rightButtons.add(cartButton);

        // Botón Categorías
JButton categoryButton = new JButton(new ImageIcon("C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\Categorias.png"));
categoryButton.setBorderPainted(false);
categoryButton.setContentAreaFilled(false);
categoryButton.addActionListener(e -> showCategoriesMenu(categoryButton, contentPanel));
rightButtons.add(categoryButton);


        // Botón Reservados
        JButton reservedButton = new JButton(new ImageIcon("C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\Reservados.png"));
        reservedButton.setBorderPainted(false);
        reservedButton.setContentAreaFilled(false);
        reservedButton.addActionListener(e -> showReservations());
rightButtons.add(reservedButton);

        rightButtons.add(homeButton);
        rightButtons.add(wishlistButton);
        rightButtons.add(cartButton);
        rightButtons.add(reservedButton);
        topBar.add(rightButtons, BorderLayout.EAST);

        add(topBar, BorderLayout.NORTH);

        // Panel principal con scroll
        contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBackground(chiffon);

        // Sección "Recomendados"
        JLabel recommendedLabel = new JLabel("Recomendados");
        recommendedLabel.setFont(new Font("Arial", Font.BOLD, 24));
        recommendedLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        recommendedLabel.setHorizontalAlignment(SwingConstants.LEFT);
        contentPanel.add(recommendedLabel);

        JPanel recommendedBooks = createBookSection(new String[][]{
            {"El mal de los ardientes", "Tommaso Campanella", "1600", "C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\El Mal de los Ardientes.jpg"},
            {"La dama de las camelias", "Alexandre Dumas", "1848", "C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\La dama de las camelias.jpg"},
            {"A flor de piel", "Javier Moro", "2015", "C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\A flor de piel.jpg"},
            {"Romeo y Julieta", "William Shakespeare", "1597", "C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\Romeo y Julieta.jpg"},
            {"Matar a un Ruiseñor", "Harper Lee", "1960", "C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\Matar un Ruiseñor.png"},
            {"Jane Eyre", "Charlotte Bronte", "1847", "C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\Jane Eyre.jpg"},
            {"Ana Karenina", "León Tolstoi", "1877", "C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\Ana Karenina.jpg"}

        });
        contentPanel.add(recommendedBooks);

        // Sección "Recientes"
        JLabel recentLabel = new JLabel("Agregados Recientemente");
        recentLabel.setFont(new Font("Arial", Font.BOLD, 24));
        recentLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        recentLabel.setHorizontalAlignment(SwingConstants.LEFT);
        contentPanel.add(recentLabel);

        JPanel recentBooks = createBookSection(new String[][]{
            {"Aromas de café", "Mario Escobar", "2021", "C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\Aromas de Guerra y Café.jpg"},
            {"Donde Vuelan las Mariposas", "Andrea Adrich", "2010", "C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\Donde Vuelan las mariposas.jpg"},
            {"A María el Corazón", "Pedro Calderon", "2003", "C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\A María el Corazón.jpg"},
            {"Adonis y Venus", "William Shakespeare", "1593", "C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\Venus y Adonis.jpg"},
            {"Orgullo y Prejuicio", "Jane Austen", "1813", "C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\Orgullo y Prejuicio.jpg"},
            {"El Gran Gatsby", "F.Scott Fitzgerald", "1925", "C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\El Gran Gatsby.jpg"},
            {"Cumbres Borrascosas", "Emily Bronte", "1847", "C:\\Users\\johan\\OneDrive\\Desktop\\Java\\Recursos\\Imágenes\\Cumbres Borroscosas.jpg"}

        });
        contentPanel.add(recentBooks);

        // Envolver en JScrollPane
        JScrollPane scrollPane = new JScrollPane(contentPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane, BorderLayout.CENTER);

        // Pie de página
        JPanel footer = new JPanel(new FlowLayout(FlowLayout.CENTER));
        footer.setBackground(berry);
        JLabel footerText = new JLabel("© 2024 Librería Digital - Todos los derechos reservados.");
        footerText.setForeground(Color.WHITE);
        footer.add(footerText);
        add(footer, BorderLayout.SOUTH);
    }

    // Método para crear una sección de libros
    private JPanel createBookSection(String[][] books) {
        JPanel bookSection = new JPanel(new GridLayout(0, 4, 10, 10));
        bookSection.setBackground(new Color(250, 250, 245));

        for (String[] book : books) {
            bookSection.add(createBookPanel(book[0], book[1], book[2], book[3]));
        }

        return bookSection;
    }

    // Método para crear un panel de libro
    private JPanel createBookPanel(String title, String author, String year, String imagePath) {
        JPanel bookPanel = new JPanel(new BorderLayout());
        bookPanel.setBackground(Color.WHITE);
        bookPanel.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));

        // Imagen del libro
        ImageIcon icon = new ImageIcon(imagePath);
        Image img = icon.getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH);
        JLabel bookCover = new JLabel(new ImageIcon(img));
        bookCover.setHorizontalAlignment(SwingConstants.CENTER);

        // Información del libro
        JLabel bookTitle = new JLabel("<html><center>" + title + "<br>" + author + "<br>" + year + "</center></html>");
        bookTitle.setHorizontalAlignment(SwingConstants.CENTER);
        bookTitle.setFont(new Font("Arial", Font.BOLD, 14));

        bookPanel.add(bookCover, BorderLayout.CENTER);
        bookPanel.add(bookTitle, BorderLayout.SOUTH);

        return bookPanel;
    }
     // Método para mostrar los detalles del libro
     private void openBookDetails(String title, String author, String description, int availableCopies, double price) {
        JFrame bookDetailsFrame = new JFrame("Detalles del Libro: " + title);
        bookDetailsFrame.setSize(600, 500);
        bookDetailsFrame.setLocationRelativeTo(this);

        JPanel bookDetailsPanel = new JPanel(new BorderLayout());
        bookDetailsPanel.setBackground(new Color(250, 250, 245));

        // Título del libro
        JLabel titleLabel = new JLabel("<html><b>" + title + "</b><br>Autor: " + author + "</html>", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        bookDetailsPanel.add(titleLabel, BorderLayout.NORTH);

        // Descripción del libro
        JTextArea descriptionArea = new JTextArea(description);
        descriptionArea.setEditable(false);
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setLineWrap(true);
        descriptionArea.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane descriptionScroll = new JScrollPane(descriptionArea);
        bookDetailsPanel.add(descriptionScroll, BorderLayout.CENTER);

        // Panel de opciones: cantidad, precio, añadir al carrito y reservar
        JPanel optionsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        optionsPanel.setBackground(new Color(250, 250, 245));

        JLabel availableLabel = new JLabel("Disponible: " + availableCopies + " copias");
        JLabel priceLabel = new JLabel("Precio: $ " + price);
        
        JButton addToCartButton = new JButton("Añadir al carrito");
        JButton reserveButton = new JButton("Reservar");

        optionsPanel.add(availableLabel);
        optionsPanel.add(priceLabel);
        optionsPanel.add(addToCartButton);
        optionsPanel.add(reserveButton);

        bookDetailsPanel.add(optionsPanel, BorderLayout.SOUTH);

        bookDetailsFrame.add(bookDetailsPanel);
        bookDetailsFrame.setVisible(true);
    }

    // Método para abrir el perfil de usuario
    private void openUserProfile() {
        JFrame profileFrame = new JFrame("Perfil de Usuario");
        profileFrame.setSize(600, 400);
        profileFrame.setLocationRelativeTo(this);

        JPanel profilePanel = new JPanel(new BorderLayout());
        profilePanel.setBackground(new Color(250, 250, 245));

        JLabel profileTitle = new JLabel("Perfil de Usuario", JLabel.CENTER);
        profileTitle.setFont(new Font("Arial", Font.BOLD, 20));
        profilePanel.add(profileTitle, BorderLayout.NORTH);

        profileFrame.add(profilePanel);
        profileFrame.setVisible(true);
    }
    // Método para abrir la ventana de Wishlist
private void openWishlist() {
    JFrame wishlistFrame = new JFrame("Tu Lista de Deseos");
    wishlistFrame.setSize(600, 400);
    wishlistFrame.setLocationRelativeTo(this);

    JPanel wishlistPanel = new JPanel(new BorderLayout());
    wishlistPanel.setBackground(new Color(250, 250, 245));

    JLabel wishlistTitle = new JLabel("Lista de Deseos", JLabel.CENTER);
    wishlistTitle.setFont(new Font("Arial", Font.BOLD, 20));
    wishlistPanel.add(wishlistTitle, BorderLayout.NORTH);

    // Panel para mostrar los libros de la Wishlist
    JPanel booksPanel = new JPanel();
    booksPanel.setLayout(new BoxLayout(booksPanel, BoxLayout.Y_AXIS));
    booksPanel.setBackground(new Color(250, 250, 245));

    // Aquí se agregarían los libros que están en la Wishlist
    for (String[] book : getWishlistBooks()) {
        JPanel bookPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        bookPanel.setBackground(Color.WHITE);
        bookPanel.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));

        JLabel bookLabel = new JLabel(book[0] + " - " + book[1]);
        bookLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        bookPanel.add(bookLabel);

        booksPanel.add(bookPanel);
    }

    JScrollPane scrollPane = new JScrollPane(booksPanel);
    wishlistPanel.add(scrollPane, BorderLayout.CENTER);

    wishlistFrame.add(wishlistPanel);
    wishlistFrame.setVisible(true);
}

// Método auxiliar para obtener libros de la Wishlist (puedes personalizarlo)
private java.util.List<String[]> getWishlistBooks() {
    // Simulación de libros en la Wishlist
    java.util.List<String[]> wishlistBooks = new java.util.ArrayList<>();
    wishlistBooks.add(new String[]{"Libro 1", "Autor 1"});
    wishlistBooks.add(new String[]{"Libro 2", "Autor 2"});
    wishlistBooks.add(new String[]{"Libro 3", "Autor 3"});
    return wishlistBooks;
}

// Método para agregar un libro al carrito
private void addToCart(String bookTitle, double price) {
    cartBooks.add(bookTitle);
    bookPrices.put(bookTitle, price);
    JOptionPane.showMessageDialog(this, "Libro agregado al carrito: " + bookTitle);
}

// Método para mostrar los libros del carrito
private void showCart() {
    JFrame cartFrame = new JFrame("Carrito de Compras");
    cartFrame.setSize(400, 300);
    cartFrame.setLocationRelativeTo(this);

    JPanel cartPanel = new JPanel();
    cartPanel.setLayout(new BorderLayout());
    cartPanel.setBackground(new Color(250, 250, 245));

    // Lista de libros y precios
    JTextArea cartArea = new JTextArea();
    cartArea.setEditable(false);
    cartArea.setFont(new Font("Arial", Font.PLAIN, 14));
    cartArea.setWrapStyleWord(true);
    cartArea.setLineWrap(true);

    double totalPrice = 0.0;
    StringBuilder cartDetails = new StringBuilder("Libros en el carrito:\n\n");
    for (String book : cartBooks) {
        double price = bookPrices.getOrDefault(book, 0.0);
        cartDetails.append(book).append(" - $").append(String.format("%.2f", price)).append("\n");
        totalPrice += price;
    }
    cartDetails.append("\nPrecio Total: $").append(String.format("%.2f", totalPrice));
    cartArea.setText(cartDetails.toString());

    JScrollPane scrollPane = new JScrollPane(cartArea);
    cartPanel.add(scrollPane, BorderLayout.CENTER);

    // Botón para cerrar la ventana
    JButton closeButton = new JButton("Cerrar");
    closeButton.addActionListener(e -> cartFrame.dispose());
    cartPanel.add(closeButton, BorderLayout.SOUTH);

    cartFrame.add(cartPanel);
    cartFrame.setVisible(true);
}

    // Método para filtrar libros
    private void filterBooks() {
        String query = searchField.getText().toLowerCase();
        JOptionPane.showMessageDialog(this, "Filtrar libros por: " + query);
    }
    // Método para agregar un libro a las reservas
private void addToReservations(String bookTitle) {
    reservedBooks.add(bookTitle);
    JOptionPane.showMessageDialog(this, "Libro reservado: " + bookTitle);
}

// Método para mostrar los libros reservados
private void showReservations() {
    JFrame reservationFrame = new JFrame("Libros Reservados");
    reservationFrame.setSize(400, 300);
    reservationFrame.setLocationRelativeTo(this);

    JPanel reservationPanel = new JPanel();
    reservationPanel.setLayout(new BorderLayout());
    reservationPanel.setBackground(new Color(240, 245, 250));

    // Lista de libros reservados
    JTextArea reservationArea = new JTextArea();
    reservationArea.setEditable(false);
    reservationArea.setFont(new Font("Arial", Font.PLAIN, 14));
    reservationArea.setWrapStyleWord(true);
    reservationArea.setLineWrap(true);

    StringBuilder reservationDetails = new StringBuilder("Libros Reservados:\n\n");
    if (reservedBooks.isEmpty()) {
        reservationDetails.append("No hay libros reservados.");
    } else {
        for (String book : reservedBooks) {
            reservationDetails.append("- ").append(book).append("\n");
        }
    }
    reservationArea.setText(reservationDetails.toString());

    JScrollPane scrollPane = new JScrollPane(reservationArea);
    reservationPanel.add(scrollPane, BorderLayout.CENTER);

    // Botón para cerrar la ventana
    JButton closeButton = new JButton("Cerrar");
    closeButton.addActionListener(e -> reservationFrame.dispose());
    reservationPanel.add(closeButton, BorderLayout.SOUTH);

    reservationFrame.add(reservationPanel);
    reservationFrame.setVisible(true);
}
// Método para mostrar el menú de categorías
private void showCategoriesMenu(JButton categoryButton, JPanel mainContentPanel) {
    JPopupMenu categoryMenu = new JPopupMenu();

    // Lista de categorías
    String[] categories = {
        "Romance", "Historia", "Aventura", "Misterio", "Terror",
        "Filosofía", "Fantasía", "Ciencia Ficción", "Biografía",
        "Poesía", "Cómics y Novelas Gráficas", "Autoayuda", 
        "Infantil", "Cocina", "Negocios y Economía", 
        "Tecnología", "Cultura y Sociedad", "Humor"
    };

    // Agregar cada categoría al menú
    for (String category : categories) {
        JMenuItem menuItem = new JMenuItem(category);

        menuItem.addActionListener(e -> {
            // Cambiar el contenido principal al de la categoría seleccionada
            switchToCategoryPanel(category, mainContentPanel);
        });

        categoryMenu.add(menuItem);
    }

    // Mostrar el menú al presionar el botón
    categoryMenu.show(categoryButton, categoryButton.getWidth() / 2, categoryButton.getHeight());
}

// Método para cambiar al panel de la categoría seleccionada
private void switchToCategoryPanel(String category, JPanel mainContentPanel) {
    mainContentPanel.removeAll(); // Limpiar el panel principal

    // Crear un nuevo panel para la categoría seleccionada
    JPanel categoryPanel = new JPanel();
    categoryPanel.setLayout(new BorderLayout());

    JLabel categoryLabel = new JLabel("Categoría: " + category, SwingConstants.CENTER);
    categoryLabel.setFont(new Font("Arial", Font.BOLD, 20));

    // Agregar un mensaje o contenido inicial para cada categoría
    JTextArea categoryContent = new JTextArea("Aquí se mostrarán los libros de la categoría: " + category);
    categoryContent.setEditable(false);

    // Agregar componentes al panel de categoría
    categoryPanel.add(categoryLabel, BorderLayout.NORTH);
    categoryPanel.add(new JScrollPane(categoryContent), BorderLayout.CENTER);

    // Añadir el panel de la categoría al panel principal
    mainContentPanel.add(categoryPanel, BorderLayout.CENTER);

    // Refrescar la interfaz para mostrar los cambios
    mainContentPanel.revalidate();
    mainContentPanel.repaint();
}


    
}

