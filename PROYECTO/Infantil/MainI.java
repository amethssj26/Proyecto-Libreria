package Infantil;

public class MainI {
    public static void main(String[] args) {
        // Crear algunos libros de ejemplo
        Infantil[] libros = new Infantil[] {
            new Infantil("100 datos curiosos de los animales", "Andrea Hernández", 11.95, 20, 
            "Descubre 100 curiosidades interesantes y a menudo sorprendentes sobre los animales, dinosaurios, vehículos y el cuerpo humano con estos libros repletos de adhesivos.",
            "Planeta Kids", "15/04/2021", 100, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\1.png"),
        new Infantil("100 datos curiosos de los dinosaurios", "Marco Dávila", 12.00, 18, 
            "Una colección de datos impresionantes sobre dinosaurios, desde sus hábitos alimenticios hasta sus formas de defensa, con ilustraciones realistas.",
            "Altea", "12/06/2019", 200, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\2.png"),
        new Infantil("101 datos curiosos de los dinosaurios", "Laura Campos", 15.00, 25, 
            "Explora hechos fascinantes y menos conocidos sobre los dinosaurios en este libro ilustrado que cautivará a los amantes de la paleontología.",
            "Ediciones T-Rex", "20/09/2022", 250, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\3.png"),
        new Infantil("100 datos curiosos del cuerpo humano", "Dr. José Robles", 25.00, 20, 
            "Conoce el funcionamiento interno del cuerpo humano con este libro que detalla curiosidades y procesos fascinantes de la biología.",
            "Ediciones Científicas", "05/03/2020", 100, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\4.png"),
        new Infantil("10 años con Mafalda", "Quino", 14.00, 28, 
            "Recopilación de las mejores tiras cómicas de Mafalda que celebran un año lleno de humor, reflexión y crítica social.",
            "Lumen", "07/10/1995", 140, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\5.png"),
        new Infantil("10 maneras de dormir a un unicornio", "Sofía Morales", 12.00, 22, 
            "Un libro encantador que enseña a los niños formas creativas y mágicas para que los unicornios encuentren dulces sueños.",
            "Alfaguara Infantil", "14/11/2018", 50, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\6.png"),
        new Infantil("Los más bellos cuentos infantiles", "Varios autores", 20.00, 15, 
            "Colección de cuentos clásicos y modernos para los más pequeños, repletos de valores y enseñanzas.",
            "Santillana", "25/12/2010", 180, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\7.png"),
        new Infantil("La pulga aventurera", "Mariana López", 10.00, 30, 
            "Acompaña a una pequeña pulga en su increíble travesía por mundos llenos de desafíos y aprendizaje.",
            "Pequeño Universo", "18/08/2017", 100, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\8.png"),
        new Infantil("Océano Pacífico", "Carolina Sánchez", 15.00, 17, 
            "Un viaje ilustrado por el océano más grande del mundo, explorando su biodiversidad y misterios.",
            "Ediciones Cátedra", "03/07/2015", 50, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\9.png"),
        new Infantil("El cuaderno de Ana", "Beatriz Gómez", 20.00, 24, 
            "Ana plasma sus pensamientos y reflexiones en un diario que captura momentos especiales de su vida.",
            "Editorial Planeta", "01/02/2019", 150, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\10.png"),
        new Infantil("El maíz y la arriera", "Luis Álvarez", 12.99, 12, 
            "Un cuento que refleja la relación simbiótica entre la naturaleza y las comunidades campesinas.",
            "Ediciones Alianza", "22/06/2021", 120, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\11.png"),
        new Infantil("Navidad juntos", "Clara Fernández", 11.99, 19, 
            "Historias conmovedoras que capturan el espíritu de la Navidad y la unión familiar.",
            "Alianza Editorial", "01/12/2016", 200, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\12.png"),
        new Infantil("El agua y tú", "Roberto Acosta", 24.99, 22, 
            "Un libro educativo sobre la importancia del agua y cómo cuidarla para futuras generaciones.",
            "Fondo de Cultura Económica", "10/09/2018", 260, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\13.png"),
        new Infantil("Érase una vez en los Beatos", "Jostein Gaarder", 11.00, 27, 
            "Una novela que combina la magia de la narrativa con reflexiones filosóficas sobre la vida y el universo.",
            "Editorial Planeta", "30/04/2020", 300, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\14.png"),
        new Infantil("Tiburones y parientes", "Carlos Beltrán", 30.00, 10, 
            "Explora el fascinante mundo de los tiburones y sus parientes cercanos en este libro informativo.",
            "Editorial Losada", "08/05/2014", 200, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\15.png"),
        new Infantil("Arañas y parientes", "María Ortiz", 9.00, 21, 
            "Un libro que detalla las características de las arañas y otros arácnidos, ideal para jóvenes exploradores.",
            "Ediciones 1940", "16/10/2019", 130, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\16.png"),
        new Infantil("Mariposas y polillas", "Raúl Rodríguez", 20.00, 15, 
            "Descubre la diversidad y belleza de las mariposas y polillas con este libro repleto de datos y fotografías.",
            "Fondo de Cultura Económica", "27/03/2021", 100, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\17.png"),
        new Infantil("Bosques", "Clara Martínez", 15.00, 24, 
            "Adéntrate en los ecosistemas forestales y aprende sobre su importancia para el planeta.",
            "Ediciones Istmo", "05/07/2013", 200, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\18.png"),
        new Infantil("La tierra de arena", "Mónica Pérez", 25.00, 20, 
            "Explora los paisajes y desafíos del desierto con este libro ilustrado que fascinará a los lectores.",
            "Editorial Siglo XXI", "14/06/2020", 50, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\19.png"),
        new Infantil("Los piratas", "Fernando Ruiz", 10.50, 14, 
            "Una aventura épica sobre los piratas más famosos y sus historias llenas de emoción y peligro.",
            "Ediciones Gallimard", "09/11/2018", 100, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.INFANTIL\\20.png")
        

        };

        // Crear la ventana principal
        new listaLibroI(libros);
    }
}
