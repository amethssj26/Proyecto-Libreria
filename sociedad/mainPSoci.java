package soc;
public class mainPSoci { 

    public static void main(String[] args) { 

        // Crear algunos libros de ejemplo 

        sociedad[] libros = new sociedad[] { 

            new sociedad("Sapiens: De animales a dioses", "Yuval Noah Harari", 24.99, 12,  
                "Una exploración fascinante de la historia de la humanidad y cómo nos hemos convertido en lo que somos hoy.", 
                "Debate", "2011", 496, "Español", "C:\\imagenes\\sapiens.jpg"), 
        
            new sociedad("Homo Deus: Breve historia del mañana", "Yuval Noah Harari", 22.99, 10,  
                "Un análisis de las posibilidades y retos futuros de la humanidad en un mundo dominado por la tecnología.", 
                "Debate", "2015", 448, "Español", "C:\\imagenes\\homodeus.jpg"), 
        
            new sociedad("El contrato social", "Jean-Jacques Rousseau", 9.99, 11,  
                "Un clásico de la filosofía política que aborda los principios de la organización social y la soberanía.", 
                "Alianza", "1762", 208, "Español", "C:\\imagenes\\contrato_social.jpg"), 
        
            new sociedad("El capital en el siglo XXI", "Thomas Piketty", 34.99, 10,  
                "Un análisis económico sobre la desigualdad y su impacto en las sociedades contemporáneas.", 
                "Fondo de Cultura Económica", "2013", 696, "Español", "C:\\imagenes\\capital.jpg"), 
        
            new sociedad("La ética protestante y el espíritu del capitalismo", "Max Weber", 14.99, 12,  
                "Una obra clave que conecta la ética religiosa con el desarrollo del capitalismo moderno.", 
                "Alianza", "1905", 288, "Español", "C:\\imagenes\\etica_protestante.jpg"), 
        
            new sociedad("1984", "George Orwell", 14.99, 16,  
                "Un clásico distópico que describe un mundo gobernado por la vigilancia totalitaria.", 
                "Debolsillo", "1949", 328, "Español", "C:\\imagenes\\1984.jpg"), 
        
            new sociedad("Fahrenheit 451", "Ray Bradbury", 16.99, 22,  
                "Un clásico de ciencia ficción que aborda la censura y el poder de los libros.", 
                "Debolsillo", "1953", 256, "Español", "C:\\imagenes\\fahrenheit.jpg"), 
        
            new sociedad("Rebelión en la granja", "George Orwell", 12.99, 18,  
                "Una sátira política que utiliza animales para criticar la corrupción del poder.", 
                "Debolsillo", "1945", 144, "Español", "C:\\imagenes\\granja.jpg"), 
        
            new sociedad("El hombre en busca de sentido", "Viktor Frankl", 13.99, 12,  
                "Un testimonio sobre la experiencia en los campos de concentración y la búsqueda de propósito en la vida.", 
                "Herder", "1946", 200, "Español", "C:\\imagenes\\hombre_sentido.jpg"), 
        
            new sociedad("Los condenados de la Tierra", "Frantz Fanon", 19.99, 10,  
                "Una obra que analiza la opresión colonial y las luchas de liberación en el Tercer Mundo.", 
                "Fondo de Cultura Económica", "1961", 280, "Español", "C:\\imagenes\\condenados.jpg"), 
        
            new sociedad("Cómo mueren las democracias", "Steven Levitsky y Daniel Ziblatt", 17.99, 14,  
                "Un análisis de las amenazas a las democracias modernas y cómo protegerlas.", 
                "Ariel", "2018", 368, "Español", "C:\\imagenes\\democracias.jpg"), 
        
            new sociedad("La civilización del espectáculo", "Mario Vargas Llosa", 15.99, 16,  
                "Un ensayo que critica el rumbo cultural de la sociedad contemporánea.", 
                "Alfaguara", "2012", 256, "Español", "C:\\imagenes\\civilizacion.jpg"), 
        
            new sociedad("Mujer, raza y clase", "Angela Davis", 18.99, 12,  
                "Un análisis interseccional de la opresión basado en género, raza y clase.", 
                "Akal", "1981", 360, "Español", "C:\\imagenes\\mujer_raza_clase.jpg"), 
        
            new sociedad("La sociedad del cansancio", "Byung-Chul Han", 10.99, 20,  
                "Un ensayo que reflexiona sobre el agotamiento y la hiperproductividad en la sociedad contemporánea.", 
                "Herder", "2010", 104, "Español", "C:\\imagenes\\cansancio.jpg"), 
        
            new sociedad("Capitalismo y libertad", "Milton Friedman", 14.99, 15,  
                "Un libro influyente sobre la relación entre el libre mercado y la libertad individual.", 
                "Universidad de Chicago", "1962", 272, "Español", "C:\\imagenes\\capitalismo_libertad.jpg"), 
        
            new sociedad("La lucha por el reconocimiento", "Axel Honneth", 21.99, 8,  
                "Un ensayo filosófico sobre la importancia del reconocimiento en las relaciones humanas y sociales.", 
                "Crítica", "1995", 384, "Español", "C:\\imagenes\\reconocimiento.jpg"), 
        
            new sociedad("Utopía", "Tomás Moro", 11.99, 18,  
                "Una obra clásica sobre la organización ideal de una sociedad ficticia.", 
                "Alianza", "1516", 192, "Español", "C:\\imagenes\\utopia.jpg"), 
        
            new sociedad("El segundo sexo", "Simone de Beauvoir", 25.99, 10,  
                "Una obra seminal sobre el feminismo y la posición de la mujer en la sociedad.", 
                "Cátedra", "1949", 768, "Español", "C:\\imagenes\\segundo_sexo.jpg"), 
        
            new sociedad("Pensar rápido, pensar despacio", "Daniel Kahneman", 22.95, 20,  
                "Un análisis sobre cómo funcionan nuestras decisiones y los sesgos que las afectan.", 
                "Debate", "2011", 608, "Español", "C:\\imagenes\\pensar.jpg"), 
        
            new sociedad("La trampa de la diversidad", "Daniel Bernabé", 14.95, 12,  
                "Una crítica al uso del concepto de diversidad como herramienta de fragmentación social.", 
                "Akal", "2018", 200, "Español", "C:\\imagenes\\diversidad.jpg") 
        
        }; 
        
        // Crear la ventana principal 
        
        new listaLibroSoci(libros); 
        
        } 
    }