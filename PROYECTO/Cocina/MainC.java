package Cocina;

public class MainC {
    public static void main(String[] args) {
        // Crear algunos libros de ejemplo
        Cocina[] libros = new Cocina[] {
            new Cocina("Shabbat", "Adeena Sussman", 15.00, 20, 
            "Recetas para las festividades judías con un toque moderno.", 
            "Hardie Grant", "15/09/2023", 100, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\1.png"),
new Cocina("Start Here", "Sohla El-Waylly", 26.00, 18, 
            "Un libro para cocineros de todos los niveles, con recetas y lecciones en cada paso.",
            "Clarkson Potter", "12/09/2023", 150, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\2.png"),
new Cocina("The Book of Sichuan Chili Crisp", "Jing Gao", 21.00, 25, 
            "Recetas creativas usando salsa chili crisp, ideal para los amantes del picante.",
            "Ten Speed Press", "06/08/2023", 200, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\3.png"),
new Cocina("El secreto de la cocina", "Bee Wilson", 20.83, 22, 
            "Un enfoque práctico para cocinar de manera rápida y deliciosa.",
            "Vintage", "01/09/2023", 180, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\4.png"),
new Cocina("Ottolenghi Simple", "Yotam Ottolenghi", 20.00, 28, 
            "Recetas inspiradas en la cocina del Medio Oriente, fáciles de preparar con 10 ingredientes básicos.",
            "Ten Speed Press", "01/10/2018", 140, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\5.png"),
new Cocina("Brutto: A (Simple) Florentine Cookbook", "Russell Norman", 23.21, 18, 
            "Recetas italianas sencillas para platos pequeños y festivos.",
            "Hardie Grant", "15/08/2023", 100, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\6.png"),
new Cocina("Persiana", "Sabrina Ghayour", 20.00, 19, 
            "Recetas persas modernas, accesibles y deliciosas.",
            "Interlink Books", "05/05/2014", 120, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\7.png"),
new Cocina("The Quick Roasting Tin", "Rukmini Iyer", 10.00, 24, 
            "Recetas de comidas rápidas de una sola bandeja para simplificar la cocina diaria.",
            "Hardie Grant", "03/05/2018", 150, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\8.png"),
new Cocina("Comfort MOB", "Ben Lebus", 13.02, 20, 
            "Recetas de comida reconfortante fáciles de preparar para el día a día.",
            "Hardie Grant", "20/06/2023", 180, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\9.png"),
new Cocina("Falastin", "Sami Tamimi y Tara Wigley", 21.00, 25, 
            "Cocina palestina con más de 100 recetas tradicionales.",
            "Ten Speed Press", "03/11/2020", 200, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\10.png"),
new Cocina("More is More ", "Ruth Rogers y Rose Gray", 24.00, 22, 
            "Recetas que capturan el corazón de la comida italiana en el deli.",
            "HarperCollins", "12/04/2023", 150, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\11.png"),
new Cocina("Let’s Eat", "Sabrina Ghayour", 16.99, 19, 
            "Recetas irresistibles de galletas y dulces que combinan tradición y modernidad.",
            "Interlink Books", "10/06/2023", 130, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\12.png"),
new Cocina("Veg-Table", "America’s Test Kitchen Kids", 19.95, 20, 
            "Un libro para los más pequeños que quieren aprender a cocinar con facilidad.",
            "America's Test Kitchen", "11/07/2019", 160, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\13.png"),
new Cocina("Cacio e Pepe", "Richard C. Boulware", 25.00, 18, 
            "Recetas para los postres más populares de la ciudad de Nueva York.",
            "HarperCollins", "10/02/2020", 100, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\14.png"),
new Cocina("Maman & Me", "Nancy Singleton Hachisu", 25.50, 22, 
            "Recetas japonesas auténticas que destacan los ingredientes frescos y locales.",
            "Andrews McMeel Publishing", "08/12/2013", 140, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\15.png"),
new Cocina("The Flavor Equation", "Yotam Ottolenghi y Helen Goh", 22.00, 20, 
            "Recetas dulces para todo tipo de postres y ocasiones.",
            "Ten Speed Press", "01/06/2017", 180, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\16.png"),
new Cocina("Smitten Kitchen Keepers", "Yotam Ottolenghi", 28.00, 25, 
            "Recetas vegetales llenas de sabor y creatividad.",
            "Ebury Press", "05/09/2010", 150, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\17.png"),
new Cocina("Baking", "Samin Nosrat", 35.00, 15, 
            "Un enfoque único para entender los cuatro pilares de la cocina.",
            "Simon & Schuster", "16/04/2017", 200, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\18.png"),
new Cocina("Baked: New Frontiers in Baking", "Karen Page y Andrew Dornenburg", 25.00, 18, 
            "Una guía esencial de combinaciones de sabores.",
            "Hachette Books", "15/08/2008", 180, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\19.png"),
new Cocina("Modern Comfort Food", "Phaidon Press", 50.00, 25, 
            "Una de las colecciones más completas de recetas italianas.",
            "Phaidon Press", "10/05/2005", 300, "Inglés", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.COCINA\\20.png")

        };

        // Crear la ventana principal
        new listaLibroC(libros);
    }
}
