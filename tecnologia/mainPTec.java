package tec;
public class mainPTec { 

    public static void main(String[] args) { 

        // Crear algunos libros de ejemplo 

        tecnologia[] libros = new tecnologia[] { 

            new tecnologia("Código Limpio", "Robert C. Martin", 39.99, 10,  

                "Un libro esencial para aprender a escribir código claro, limpio y mantenible.", 

                "Pearson Educación", "2008", 464, "Español", "C:\\imagenes\\Clean-Code.jpg"), 

            new tecnologia("El programador pragmático", "Andrew Hunt y David Thomas", 45, 15,  

                "Una obra imprescindible para desarrolladores que abarca estrategias prácticas para resolver problemas complejos en la programación.", 

                "Addison-Wesley", "2019", 352, "Español", "C:\\imagenes\\progra.jpg"), 

            new tecnologia("Introducción a la inteligencia artificial", "Stuart Russell y Peter Norvig", 54.99, 8,  

                "Un texto académico fundamental para entender los principios de la inteligencia artificial.", 

                "Pearson Educación", "2010", 1136, "Español", "C:\\imagenes\\intro.jpg"), 

            new tecnologia("Python para todos", "Raúl González Duque", 25, 14,  

                "Introducción práctica al lenguaje Python, orientada a principiantes y desarrolladores intermedios.", 

                "Marcombo", "2019", 300, "Español", "C:\\imagenes\\python.jpg"), 

            new tecnologia("Estructuras de datos y algoritmos en Java", "Michael T. Goodrich y Roberto Tamassia", 60, 8,  

                "Una guía completa para entender cómo aplicar estructuras de datos y algoritmos eficientemente en Java.", 

                "Wiley", "2017", 740, "Español", "C:\\imagenes\\data.jpg"), 

            new tecnologia("El gran libro de HTML5, CSS3 y JavaScript", "J.D Gauchat", 35, 13,  

                "Guía completa y actualizada para aprender a desarrollar sitios web modernos y funcionales.", 

                "Anaya Multimedia", "2021", 500, "Español", "C:\\imagenes\\gran.webp"), 

            new tecnologia("Big Data", "David Ríos Insua y  David Gómez-Ullate Oteiza", 49.95, 9,  

                "Libro introductorio al análisis de grandes volúmenes de datos y sus aplicaciones en el mundo actual.", 

                "Marcombo", "2020", 400, "Español", "C:\\imagenes\\big.jpg"), 

            new tecnologia("Redes de Computadoras (5ª Edición)", "Andrew S. Tanenbaum y David J. Wetherall", 64.99, 5,  

                "Texto clásico para comprender los principios fundamentales de las redes de computadoras.", 

                "Pearson Educación", "2016", 960, "Inglés", "C:\\imagenes\\red.jpg"), 

            new tecnologia("Introducción a DevOps", "Gene Kim y Patrick Debois", 29.95, 11,  

                "Explora los principios fundamentales de DevOps, cómo implementarlos y las herramientas clave para optimizar procesos de desarrollo y operaciones.", 

                "Anaya Multimedia", "2020", 320, "Inglés", "C:\\imagenes\\dev.jpg"), 

            new tecnologia("JavaScript: Guía definitiva (6ª edición)", "David Flanagan", 54.95, 10,  

                "Un manual completo para aprender JavaScript desde los fundamentos hasta aspectos avanzados.", 

                "O'Reilly Media", "2011", 1096, "Español", "C:\\imagenes\\javao.jpg"), 

            new tecnologia("Introducción a Flutter y el Desarrollo Móvil", " Juan Andrés Peñaloza Torres", 45, 16,  

                "Guía práctica para desarrollar aplicaciones multiplataforma utilizando Flutter y Dart.", 

                "Independiente", "2023", 117, "Español", "C:\\imagenes\\introd.jpg"), 

            new tecnologia("Docker y Kubernetes para desarrolladores", " Jaroslaw Krochmalski", 44.99, 10,  

                "Introducción práctica al uso de contenedores y orquestación de aplicaciones con Docker y Kubernetes.", 

                "Packt Publishing", "2017", 318, "Inglés", "C:\\imagenes\\doc.jpg"), 

            new tecnologia("Blockchain: La revolución tecnológica", "Don Tapscott", 35, 9,  

                "Exploración de cómo la tecnología blockchain está transformando industrias y negocios.", 

                "Deusto", "2017", 528, "Español", "C:\\imagenes\\block.jpg"), 

            new tecnologia("El gran libro de Android", " Jesús Tomás Gironés y Jaime Lloret Mauri", 28.99, 12,  

                "Una guía completa para aprender a desarrollar aplicaciones móviles nativas con Android Studio, desde conceptos básicos hasta avanzados.", 

                "Marrcombo", "2022", 602, "Español", "C:\\imagenes\\elgra.jpg"), 

            new tecnologia("Inteligencia artificial aplicada hoy", " Dr. Il Sung Park", 16.80, 5,  

                "Esta obra es una guía esencial para comprender cómo la transformación digital está redefiniendo sectores.", 

                "Independiente", "2024", 138, "Español", "C:\\imagenes\\ai.jpg"), 

            new tecnologia("Machine Learning: Introducción práctica con Python", "Sebastián Raschka y Vahid Mirjalili", 23.90, 6,  

                "Una guía práctica para aprender los conceptos fundamentales de Machine Learning utilizando Python.", 

                "Anaya Multimedia", "2020", 600, "Español", "C:\\imagenes\\mach.jpg"), 

            new tecnologia("Análisis y diseño de sistemas de información", "Kenneth E. Kendall y Julie E. Kendall", 55.00, 13,  

                "Aborda los fundamentos y técnicas para analizar y diseñar sistemas de información en organizaciones.", 

                "Pearson Eduacación", "2005", 756, "Español", "C:\\imagenes\\ana.png"), 

            new tecnologia("Ingeniería de software: Un enfoque práctico (7ª edición)", "Roger S. Pressman", 64.99, 7,  

                "Referencia esencial sobre metodologías y técnicas para el desarrollo profesional de software.", 

                "McGraw Hill", "2015", 920, "Español", "C:\\imagenes\\ing.jpg"), 

            new tecnologia("Aprendiendo Git y GitHub", " Miguel Ángel Durán", 14.99, 5,  

                "Una guía práctica para dominar Git, el sistema de control de versiones más utilizado, ideal para proyectos individuales o en equipo.", 

                "Independiente", "2024", 332, "Español", "C:\\imagenes\\git.jpg"), 

            new tecnologia("Unity y C# Desarrollo de videojuegos", "Luis Ruelas", 16.99, 11,  

                "Este libro está desarrollado para que las personas que quieran adentrase en el mundo de la programación de videojuegos puedan aprender, de forma didáctica y desde cero, como es la creación de un videojuego en una plataforma 3D y con todos los elementos de un juego profesional, de forma sencilla y completamente práctica.", 

                "Ra-Ma", "2018", 280, "Español", "C:\\imagenes\\unity.jpg") 

        }; 

 

        // Crear la ventana principal 

        new listaLibroTec(libros); 

    } 

} 


