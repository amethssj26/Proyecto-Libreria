package Economia;

public class MainE {
    public static void main(String[] args) {
        // Crear algunos libros de ejemplo
        Economia[] libros = new Economia[] {
            new Economia("Principios de Economía", "N. Gregory Mankiw", 64.98, 20,
            "Introducción completa a los principios económicos, ideal para estudiantes.",
            "Cengage Learning", "15/04/2021", 864, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\1.png"),
new Economia("La economía del bien común", "Jean Tirole", 23.90, 18,
            "Estudio sobre la gestión económica y su impacto social.",
            "Taurus", "12/06/2019", 400, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\2.png"),
new Economia("Por qué fracasan los países", "Daron Acemoglu y James A. Robinson", 21.75, 25,
            "Un análisis sobre la importancia de las instituciones en el desarrollo económico.",
            "Taurus", "20/09/2022", 600, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\3.png"),
new Economia("Freakonomics", "Steven D. Levitt y Stephen J. Dubner", 15.90, 20,
            "Un análisis económico desde situaciones cotidianas, revelando conexiones sorprendentes.",
            "William Morrow", "05/03/2020", 368, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\4.png"),
new Economia("Teoría General del Empleo, el Interés y el Dinero", "John Maynard Keynes", 16.96, 28,
            "Obra fundamental para entender la macroeconomía y la intervención estatal en tiempos de recesión.",
            "Ediciones Akal", "07/10/1995", 500, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\5.png"),
new Economia("Repensar la pobreza", "Abhijit V. Banerjee y Esther Duflo", 21.75, 22,
            "Reflexión sobre las causas reales de la pobreza y las políticas que podrían erradicarla.",
            "Taurus", "14/11/2018", 400, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\6.png"),
new Economia("Las venas abiertas de América Latina", "Eduardo Galeano", 17.50, 15,
            "Crítica al saqueo económico de América Latina por potencias extranjeras.",
            "Siglo XXI Editores", "25/12/2010", 368, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\7.png"),
new Economia("Capital e ideología", "Thomas Piketty", 22.90, 30,
            "Un estudio sobre la desigualdad global y las ideologías que sustentan el sistema económico.",
            "Fondo de Cultura Económica", "10/08/2020", 1100, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\8.png"),
new Economia("Camino de servidumbre", "Friedrich Hayek", 18.00, 12,
            "Crítica a la intervención del Estado en la economía y sus riesgos para la libertad individual.",
            "Unión Editorial", "21/01/2000", 240, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\9.png"),
new Economia("Fundamentos de economía", "Paul A. Samuelson y William D. Nordhaus", 70.00, 25,
            "Una obra exhaustiva sobre los principios y políticas económicas.",
            "McGraw-Hill", "01/05/2015", 1000, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\10.png"),
new Economia("La riqueza de las naciones", "Adam Smith", 19.95, 30,
            "Obra fundamental sobre la economía clásica y la mano invisible del mercado.",
            "Ediciones Espasa", "25/06/1990", 1200, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\11.png"),
new Economia("La acción humana", "Ludwig von Mises", 45.00, 8,
            "Filosofía económica sobre la libertad individual y el rol del mercado.",
            "Fundación Juan de Mariana", "12/12/2001", 1000, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\12.png"),
new Economia("El capital", "Karl Marx", 20.00, 10,
            "Análisis de la economía capitalista y su crítica desde la perspectiva marxista.",
            "Ediciones Akal", "10/10/1976", 1500, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\13.png"),
new Economia("El dilema de los innovadores", "Clayton Christensen", 22.90, 16,
            "Estudia cómo las empresas exitosas pueden fracasar al no adaptarse a tecnologías disruptivas.",
            "McGraw-Hill", "05/04/2011", 368, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\14.png"),
new Economia("La economía de la felicidad", "Richard Layard", 24.90, 22,
            "Un análisis sobre cómo los factores económicos afectan el bienestar personal y social.",
            "Taurus", "08/03/2013", 350, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\15.png"),
new Economia("Macroeconomía", "Olivier Blanchard", 55.00, 18,
            "Introducción a la macroeconomía, ideal para estudiantes avanzados y profesionales.",
            "Pearson", "15/09/2017", 700, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\16.png"),
new Economia("Economía para un planeta ocupado", "Tim Jackson", 22.00, 15,
            "Reflexión sobre cómo la economía global debe adaptarse a la sostenibilidad ambiental.",
            "Editorial Paidós", "12/11/2016", 500, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\17.png"),
new Economia("La economía del futuro", "Klaus Schwab", 28.00, 20,
            "Examina los grandes cambios económicos y sociales provocados por la tecnología.",
            "Taurus", "30/06/2018", 320, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\18.png"),
new Economia("Economía en una lección", "Henry Hazlitt", 15.00, 14,
            "Un texto conciso que explica los conceptos económicos de forma clara y accesible.",
            "Libros Libres", "11/05/1989", 220, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\19.png"),
new Economia("El capital en el siglo XXI", "Thomas Piketty", 25.00, 32,
            "Análisis de la distribución de la riqueza en las últimas décadas, proponiendo medidas para reducir la desigualdad económica.",
            "Fondo de Cultura Económica", "03/04/2013", 816, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.ECONOMIA\\20.png")


        };

        // Crear la ventana principal
        new listaLibroE(libros);
    }
}
