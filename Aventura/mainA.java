package Aventura;

public class mainA {
    public static void main(String[] args) {
        // Crear algunos libros de ejemplo
        aventura[] libros = new aventura[] {
            new aventura("La isla del tesoro", "Robert Louis Stevenson", 10.99, 20, 
             "Un joven llamado Jim Hawkins encuentra un mapa del tesoro que lo lleva a una emocionante aventura llena de piratas y peligros.",
             "Alianza Editorial", "1883", 320, "Español", "C:\\imagenes\\laisla.jpg"),
            new aventura("Veinte mil leguas de viaje submarino", "Julio Verne", 12.50, 25, 
             "La extraordinaria travesía del Capitán Nemo y su submarino Nautilus a través de las profundidades de los océanos.",
             "Anaya", "1870", 512, "Español", "C:\\imagenes\\veintemil.jpg"),
            new aventura("El hobbit", "J.R.R. Tolkien", 15.99, 18, 
             "Bilbo Bolsón, un hobbit común, se embarca en una aventura épica con enanos para recuperar un tesoro custodiado por un dragón.",
             "Minotauro", "1937", 320, "Español", "C:\\imagenes\\elhobbit.jpg"),
            new aventura("Moby Dick", "Herman Melville", 14.50, 22, 
             "La obsesiva caza del capitán Ahab por la ballena blanca que arruinó su vida.",
             "Penguin Classics", "1851", 720, "Español", "C:\\imagenes\\moby.jpg"),
            new aventura("Las aventuras de Tom Sawyer", "Mark Twain", 11.99, 24, 
             "Las divertidas y emocionantes travesuras de Tom Sawyer en el río Misisipi.",
             "Anaya", "1876", 272, "Español", "C:\\imagenes\\lasaven.jpg"),
            new aventura("Los tres mosqueteros", "Alexandre Dumas", 13.50, 20, 
             "Las emocionantes hazañas de D'Artagnan y sus amigos mosqueteros al servicio del rey de Francia.",
             "Ediciones B", "1844", 736, "Español", "C:\\imagenes\\lostres.jpg"),
            new aventura("La vuelta al mundo en 80 días", "Julio Verne", 12.99, 28, 
             "Phileas Fogg apuesta que puede dar la vuelta al mundo en 80 días, enfrentándose a numerosos obstáculos.",
             "Anaya", "1872", 368, "Español", "C:\\imagenes\\lavuelta.jpg"),
            new aventura("Robinson Crusoe", "Daniel Defoe", 9.99, 26, 
             "La historia de un náufrago que lucha por sobrevivir en una isla desierta.",
             "Alianza Editorial", "1719", 384, "Español", "C:\\imagenes\\robin.jpg"),
            new aventura("El corazón de las tinieblas", "Joseph Conrad", 12.50, 19, 
             "El viaje de Marlow a través del río Congo, lleno de desafíos y descubrimientos oscuros.",
             "Penguin Classics", "1899", 208, "Español", "C:\\imagenes\\elcorazonentini.jpg"),
            new aventura("Las minas del rey Salomón", "H. Rider Haggard", 10.99, 15, 
             "Una búsqueda emocionante de un tesoro legendario en África por parte del aventurero Allan Quatermain.",
             "Editorial Planeta", "1885", 288, "Español", "C:\\imagenes\\lasminas.jpg"),
            new aventura("El Conde de Montecristo", "Alexandre Dumas", 18.50, 12, 
             "La historia de venganza y redención de Edmond Dantès tras ser injustamente encarcelado.",
             "Ediciones B", "1844", 1248, "Español", "C:\\imagenes\\elconde.jpg"),
            new aventura("En las montañas de la locura", "H.P. Lovecraft", 14.00, 16, 
             "Un viaje aterrador al continente antártico, lleno de secretos antiguos y horrores indescriptibles.",
             "Editorial Valdemar", "1936", 304, "Español", "C:\\imagenes\\enlasmon.jpg"),
            new aventura("Viaje al centro de la Tierra", "Julio Verne", 13.50, 21, 
             "Una exploración épica al corazón de nuestro planeta, llena de maravillas y peligros.",
             "Anaya", "1864", 360, "Español", "C:\\imagenes\\viajeal.jpg"),
            new aventura("Jurassic Park", "Michael Crichton", 16.99, 23, 
             "Un parque temático con dinosaurios clonados se convierte en una trampa mortal cuando las criaturas escapan.",
             "Ediciones B", "1990", 448, "Español", "C:\\imagenes\\parq.jpg"),
            new aventura("El último mohicano", "James Fenimore Cooper", 11.50, 27, 
             "Una emocionante aventura ambientada durante la guerra franco-indígena en América del Norte.",
             "Alianza Editorial", "1826", 352, "Español", "C:\\imagenes\\elultimo.jpg"),
            new aventura("Capitán de mar y guerra", "Patrick O'Brian", 15.00, 18, 
             "Las aventuras del capitán Jack Aubrey y el doctor Stephen Maturin en alta mar durante las guerras napoleónicas.",
             "Edhasa", "1969", 464, "Español", "C:\\imagenes\\capitan.jpg"),
            new aventura("El faro del fin del mundo", "Julio Verne", 13.00, 20, 
             "Una lucha épica entre tres fareros y una banda de piratas en una isla remota.",
             "Anaya", "1905", 320, "Español", "C:\\imagenes\\elfaro.jpg"),
            new aventura("El libro de la selva", "Rudyard Kipling", 10.50, 26, 
             "La historia de Mowgli, un niño criado por lobos en la selva india, y sus aventuras con los animales.",
             "Alianza Editorial", "1894", 320, "Español", "C:\\imagenes\\ellibro.jpg"),
            new aventura("Las crónicas de Narnia", "C.S. Lewis", 14.50, 24, 
             "Cuatro hermanos descubren un mundo mágico gobernado por el malvado poder de una bruja, y deben luchar para salvarlo.",
             "Destino", "1950", 224, "Español", "C:\\imagenes\\narnia.jpg"),
            new aventura("La odisea", "Homero", 12.99, 30, 
             "El épico viaje de regreso a casa del héroe griego Ulises tras la guerra de Troya.",
             "Editorial Gredos", "800 a.C.", 384, "Español", "C:\\imagenes\\laodisea.jpg")

        };

        // Crear la ventana principal
        new listaLibro(libros);
    }
}
