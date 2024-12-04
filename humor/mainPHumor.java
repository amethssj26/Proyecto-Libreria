package humor;

public class mainPHumor {
     public static void main(String[] args) { 

        // Crear algunos libros de ejemplo 

        humor[] libros = new humor[] { 

            new humor("Sin noticias de Gurb", "Eduardo Mendoza", 12.99, 10,  
                "Un hilarante relato sobre un extraterrestre perdido en Barcelona y sus disparatadas experiencias en la Tierra.", 
                "Seix Barral", "1991", 208, "Español", "C:\\imagenes\\gurb.jpg"), 
        
            new humor("La conjura de los necios", "John Kennedy Toole", 14.99, 15,  
                "Una comedia negra que retrata a un excéntrico personaje luchando contra la sociedad moderna.", 
                "Anagrama", "1980", 416, "Español", "C:\\imagenes\\conjura.jpg"), 
        
            new humor("Wilt", "Tom Sharpe", 11.99, 8,  
                "Un relato desternillante sobre un profesor atrapado en absurdas situaciones con la policía y su vida personal.", 
                "Anagrama", "1976", 320, "Español", "C:\\imagenes\\wilt.jpg"), 
        
                new humor("El gran libro de los chistes", "Varios autores", 7.99, 14,  
                "Una recopilación interminable de los mejores chistes, bromas y situaciones cómicas para disfrutar en cualquier momento.", 
                "Ediciones B", "2018", 480, "Español", "C:\\imagenes\\chistes.jpg"), 
        
            new humor("El club de los mentirosos", "Mary Karr", 13.99, 16,  
                "Un ingenioso relato autobiográfico lleno de momentos humorísticos y emotivos.", 
                "Random House", "1995", 352, "Español", "C:\\imagenes\\mentirosos.jpg"), 
        
            new humor("Tres hombres en una barca (por no hablar del perro)", "Jerome K. Jerome", 9.99, 15,  
                "Una historia cómica sobre tres amigos que emprenden un viaje en barca lleno de contratiempos y aventuras.", 
                "Alianza", "1889", 264, "Español", "C:\\imagenes\\barca.jpg"), 
        
            new humor("Los hombres son de Marte, las mujeres son de Venus (parodia)", "John Gray (adaptación humorística)", 7.99, 9,  
                "Una visión cómica sobre las diferencias entre hombres y mujeres, repleta de exageraciones hilarantes.", 
                "Humor Books", "2000", 192, "Español", "C:\\imagenes\\martevenus.jpg"), 
        
            new humor("Maldito karma", "David Safier", 12.99, 15,  
                "La hilarante historia de una mujer que acumula mal karma y renace como hormiga.", 
                "Seix Barral", "2007", 320, "Español", "C:\\imagenes\\karma.jpg"), 
        
            new humor("El asombroso viaje de Pomponio Flato", "Eduardo Mendoza", 10.99, 8,  
                "Una sátira histórica que mezcla humor absurdo con una trama detectivesca en tiempos de Cristo.", 
                "Seix Barral", "2008", 192, "Español", "C:\\imagenes\\pomponio.jpg"), 
        
            new humor("Los Simpson y la filosofía", "William Irwin (compilador)", 15.99, 10,  
                "Un análisis divertido y profundo de las ideas filosóficas detrás de los episodios de Los Simpson.", 
                "Blackwell", "2001", 336, "Español", "C:\\imagenes\\simpson.jpg"), 
        
                new humor("La loca historia del mundo", "Mel Brooks", 14.99, 18,  
                "El legendario cómico Mel Brooks ofrece una hilarante visión de la historia humana desde su particular punto de vista.", 
                "Blackie Books", "2021", 320, "Español", "C:\\imagenes\\historia.jpg"), 
        
            new humor("¿Por qué los hombres no escuchan y las mujeres no entienden los mapas?", "Barbara Pease y Allan Pease", 10.99, 12,  
                "Una divertida exploración de las diferencias de género a través de anécdotas cómicas.", 
                "Amat Editorial", "2000", 312, "Español", "C:\\imagenes\\hombres_mujeres.jpg"), 
        
            new humor("Guía del autoestopista galáctico", "Douglas Adams", 14.99, 16,  
                "Una desternillante historia de ciencia ficción y comedia sobre un humano perdido en el espacio.", 
                "Anagrama", "1979", 320, "Español", "C:\\imagenes\\autoestopista.jpg"), 
        
            new humor("El diario de Bridget Jones", "Helen Fielding", 11.99, 18,  
                "Un diario lleno de situaciones cómicas y desastres amorosos que relata la vida de una mujer soltera.", 
                "Penguin Books", "1996", 288, "Español", "C:\\imagenes\\bridget.jpg"), 
        
            new humor("Yo fui a EGB", "Javier Ikaz y Jorge Díaz", 13.99, 12,  
                "Una recopilación nostálgica y cómica sobre la vida durante los años de la EGB.", 
                "Plaza & Janés", "2013", 256, "Español", "C:\\imagenes\\egb.jpg"), 
        
            new humor("Por no mencionar al perro", "Connie Willis", 12.99, 15,  
                "Una divertida novela de ciencia ficción que mezcla viajes en el tiempo con humor británico.", 
                "Nova", "1997", 512, "Español", "C:\\imagenes\\perro.jpg"), 
        
            new humor("Mi familia y otros animales", "Gerald Durrell", 10.99, 20,  
                "Un relato autobiográfico lleno de anécdotas cómicas sobre la vida de una peculiar familia.", 
                "Destino", "1956", 368, "Español", "C:\\imagenes\\familia.jpg"), 
        
            new humor("Fútbol contra el enemigo", "Simon Kuper", 15.99, 15,  
                "Aunque no es estrictamente un libro de humor, la obra tiene una mirada irónica y cómica sobre el fútbol y su influencia en la cultura global.", 
                "Editorial Debate", "1994", 320, "Español", "C:\\imagenes\\futbol.jpg"), 
        
            new humor("El club de los incomprendidos", "Blue Jeans", 13.99, 20,  
                "Una novela de humor juvenil que explora las peripecias de un grupo de adolescentes con un toque de diversión y amistad.", 
                "Montena", "2014", 340, "Español", "C:\\imagenes\\incomprendidos.jpg"), 
        
            new humor("La insoportable levedad del ser", "Milan Kundera", 14.99, 10,  
                "Una reflexión filosófica con toques de humor absurdo sobre el amor, el destino y la libertad.", 
                "Tusquets Editores", "1984", 300, "Español", "C:\\imagenes\\levedad.jpg"),
        
        }; 
        
        // Crear la ventana principal 
        
        new listaLibroHumor(libros); 
        
        } 
    }

        