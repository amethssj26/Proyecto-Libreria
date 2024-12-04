package cultura;
public class mainPCult { 

    public static void main(String[] args) { 
       


        // Crear algunos libros de ejemplo 

        cultura[] libros = new cultura[] { 

            new cultura("El nombre de la rosa", "Umberto Eco", 19.99, 15,  
                "Un thriller histórico ambientado en una abadía medieval, donde un monje debe resolver un asesinato misterioso.", 
                "Lumen", "1980", 592, "Español", "C:\\imagenes\\nombre_rosa.jpg"), 
        
            new cultura("Los pilares de la Tierra", "Ken Follett", 24.99, 12,  
                "Una epopeya histórica que narra la construcción de una catedral en la Inglaterra del siglo XII.", 
                "Plaza & Janés", "1989", 1039, "Español", "C:\\imagenes\\pilares_tierra.jpg"), 
        
            new cultura("Cien años de soledad", "Gabriel García Márquez", 22.50, 18,  
                "Un clásico de la literatura latinoamericana que cuenta la historia de la familia Buendía en el pueblo de Macondo.", 
                "Sudamericana", "1967", 471, "Español", "C:\\imagenes\\cien_anios.jpg"), 
        
            new cultura("Don Quijote de la Mancha", "Miguel de Cervantes", 19.99, 10,  
                "La obra maestra de la literatura española que narra las aventuras de un caballero idealista y su fiel escudero.", 
                "Espasa", "1605", 1023, "Español", "C:\\imagenes\\quijote.jpg"), 
        
            new cultura("Drácula", "Bram Stoker", 18.99, 10,  
                "La historia original del icónico vampiro y su enfrentamiento con el profesor Van Helsing.", 
                "Penguin Classics", "1897", 418, "Español", "C:\\imagenes\\dracula.jpg"), 
        
            new cultura("Sherlock Holmes: Estudio en escarlata", "Arthur Conan Doyle", 12.99, 15,  
                "La primera novela que presenta al famoso detective Sherlock Holmes y su compañero Dr. Watson.", 
                "Penguin Books", "1887", 240, "Español", "C:\\imagenes\\sherlock.jpg"), 
        
            new cultura("La sombra del viento", "Carlos Ruiz Zafón", 23.95, 14,  
                "Un apasionante misterio literario ambientado en la Barcelona de posguerra.", 
                "Planeta", "2001", 576, "Español", "C:\\imagenes\\sombra_viento.jpg"), 
        
            new cultura("El psicoanalista", "John Katzenbach", 17.99, 16,  
                "Un thriller psicológico donde un psicoanalista es puesto al límite por un misterioso enemigo.", 
                "Ediciones B", "2002", 528, "Español", "C:\\imagenes\\psicoanalista.jpg"), 
        
            new cultura("La chica del tren", "Paula Hawkins", 14.95, 22,  
                "Un thriller psicológico que revela secretos ocultos en una tranquila comunidad.", 
                "Planeta", "2015", 496, "Español", "C:\\imagenes\\chica_tren.jpg"), 
        
            new cultura("El juego del ángel", "Carlos Ruiz Zafón", 20.99, 10,  
                "Una oscura historia de amor y misterio en la Barcelona de los años 1920.", 
                "Planeta", "2008", 672, "Español", "C:\\imagenes\\juego_angel.jpg"), 
        
            new cultura("El retrato de Dorian Gray", "Oscar Wilde", 15.99, 12,  
                "Un relato gótico sobre la corrupción y el deseo de la eterna juventud.", 
                "Penguin Books", "1890", 256, "Español", "C:\\imagenes\\dorian_gray.jpg"), 
        
            new cultura("Crimen y castigo", "Fiódor Dostoyevski", 21.99, 9,  
                "Una obra maestra de la literatura rusa que explora la moralidad y la psicología del crimen.", 
                "Alianza", "1866", 768, "Español", "C:\\imagenes\\crimen_castigo.jpg"), 
        
            new cultura("El perfume", "Patrick Süskind", 19.95, 13,  
                "La fascinante historia de un asesino obsesionado con crear el aroma perfecto.", 
                "Seix Barral", "1985", 320, "Español", "C:\\imagenes\\perfume.jpg"), 
        
            new cultura("La casa de los espíritus", "Isabel Allende", 18.99, 17,  
                "Una saga familiar que mezcla realismo mágico y crítica social en América Latina.", 
                "Plaza & Janés", "1982", 432, "Español", "C:\\imagenes\\casa_espiritus.jpg"), 
        
            new cultura("La metamorfosis", "Franz Kafka", 9.99, 20,  
                "Una alegoría inquietante sobre la transformación y el aislamiento.", 
                "Alianza", "1915", 104, "Español", "C:\\imagenes\\metamorfosis.jpg"), 
        
            new cultura("1984", "George Orwell", 14.99, 19,  
                "Un clásico distópico que describe un mundo gobernado por la vigilancia totalitaria.", 
                "Debolsillo", "1949", 328, "Español", "C:\\imagenes\\1984.jpg"), 
        
            new cultura("Rebelión en la granja", "George Orwell", 12.99, 18,  
                "Una sátira política que utiliza animales para criticar la corrupción del poder.", 
                "Debolsillo", "1945", 144, "Español", "C:\\imagenes\\granja.jpg"), 
        
            new cultura("El principito", "Antoine de Saint-Exupéry", 10.99, 16,  
                "Un cuento filosófico que explora la esencia de la vida y el amor a través de un pequeño príncipe.", 
                "Salamandra", "1943", 96, "Español", "C:\\imagenes\\principito.jpg"), 
        
            new cultura("Fahrenheit 451", "Ray Bradbury", 16.99, 22,  
                "Un clásico de ciencia ficción que aborda la censura y el poder de los libros.", 
                "Debolsillo", "1953", 256, "Español", "C:\\imagenes\\fahrenheit.jpg"), 
        
            new cultura("La divina comedia", "Dante Alighieri", 25.99, 10,  
                "Una obra épica que describe el viaje del alma a través del Infierno, el Purgatorio y el Paraíso.", 
                "Alianza", "1320", 800, "Español", "C:\\imagenes\\divina_comedia.jpg") 
        
        }; 
        
        // Crear la ventana principal 
        
        
        new listaLibroCult(libros); 
        
        } 
    }
        