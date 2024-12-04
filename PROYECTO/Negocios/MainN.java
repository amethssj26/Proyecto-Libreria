package Negocios;

public class MainN {
    public static void main(String[] args) {
        // Crear algunos libros de ejemplo
        Negocios[] libros = new Negocios[] {
            new Negocios("El arte de empezar", "Guy Kawasaki", 20.00, 224, 
            "Guía práctica para emprendedores que buscan lanzar un nuevo proyecto o empresa.",
            "McGraw-Hill", "01/02/2023", 224, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\1.png"),
            new Negocios("7 hábitos de la gente altamente efectiva", "Stephen R. Covey", 19.90, 416, 
            "Un clásico de la autoayuda y el desarrollo personal, enfocado en la productividad y efectividad.", 
            "McGraw-Hill", "15/09/2021", 416, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\2.png"),
            new Negocios("La estrategia del océano azul", "W. Chan Kim y Renée Mauborgne", 25.00, 300, 
            "Propone la creación de nuevos mercados sin competencia mediante la innovación.", 
            "McGraw-Hill", "12/11/2022", 300, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\3.png"),
            new Negocios("Piense y hágase rico", "Napoleon Hill", 18.00, 400, 
            "Filosofía sobre el éxito y la acumulación de riqueza, basado en la mentalidad y hábitos.", 
            "Editorial Paidós", "10/04/2021", 400, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\4.png"),
            new Negocios("El manual del emprendedor", "Steve Blank y Bob Dorf", 26.90, 500, 
            "Un enfoque práctico sobre cómo iniciar y gestionar un negocio desde cero.", 
            "Empresa Activa", "25/06/2019", 500, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\5.png"),
            new Negocios("La mentalidad del emprendedor", "Carol S. Dweck", 18.90, 320, 
            "Un análisis sobre cómo la mentalidad de crecimiento puede llevar al éxito en los negocios.", 
            "Editorial Urano", "17/08/2020", 320, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\6.png"),
            new Negocios("De cero a uno", "Peter Thiel", 22.90, 280, 
            "Reflexiones sobre la creación de empresas tecnológicas innovadoras y su impacto en el mundo.", 
            "Editorial Taurus", "05/01/2021", 280, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\7.png"),
            new Negocios("La magia del orden", "Marie Kondo", 18.90, 224, 
            "Guía sobre cómo organizar el espacio físico y mental para mejorar la productividad.", 
            "Editorial Aguilar", "30/10/2022", 224, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\8.png"),
            new Negocios("El poder de los hábitos", "Charles Duhigg", 19.90, 400, 
            "Analiza el impacto de los hábitos en el éxito personal y profesional.", 
            "Editorial Aguilar", "01/05/2021", 400, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\9.png"),
            new Negocios("La ventaja competitiva de las naciones", "Michael E. Porter", 30.00, 700, 
            "Examina cómo los países pueden desarrollar ventajas competitivas sostenibles a nivel global.", 
            "Editorial McGraw-Hill", "10/12/2020", 700, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\10.png"),
            new Negocios("La guerra del arte", "Steven Pressfield", 12.00, 200, 
            "Un enfoque sobre cómo superar las barreras internas que impiden la creatividad y el éxito.", 
            "Editorial Urano", "22/11/2018", 200, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\11.png"),
            new Negocios("Quién se ha llevado mi queso", "Spencer Johnson y Kenneth Blanchard", 13.50, 100, 
            "Una parábola sobre el cambio en el trabajo y la vida, y cómo adaptarse a él.", 
            "Editorial Empresa Activa", "17/01/2020", 100, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\12.png"),
            new Negocios("El emprendedor visionario", "Marc Benioff", 24.90, 300, 
            "Historia de cómo Salesforce transformó el sector tecnológico y la mentalidad empresarial necesaria para innovar.", 
            "Editorial Gestión 2000", "14/05/2021", 300, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\13.png"),
            new Negocios("Los secretos de la mente millonaria", "T. Harv Eker", 16.90, 200, 
            "Enseñanzas sobre cómo cambiar la mentalidad para lograr éxito financiero.", 
            "Editorial Urano", "23/07/2020", 200, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\14.png"),
            new Negocios("El lado positivo del fracaso", "John C. Maxwell", 18.00, 256, 
            "Analiza cómo los fracasos pueden ser utilizados como trampolines hacia el éxito.", 
            "Editorial Planeta", "21/11/2019", 256, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\15.png"),
            new Negocios("La fórmula del éxito", "Michael J. Mauboussin", 22.00, 350, 
            "Un enfoque sobre cómo las decisiones de negocio y las inversiones deben ser guiadas por principios científicos y racionales.", 
            "Editorial McGraw-Hill", "16/09/2020", 350, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\16.png"),
            new Negocios("El manual de la buena suerte", "Alex Rovira y Fernando Trías de Bes", 18.00, 240, 
            "Una fábula empresarial que enseña cómo aprovechar las oportunidades y la suerte.", 
            "Editorial Empresa Activa", "18/02/2021", 240, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\17.png"),
            new Negocios("La venta disruptiva", "Gilberto Lara", 22.00, 300, 
            "Guía sobre cómo las empresas deben adaptarse a los nuevos modelos de venta en un mercado altamente competitivo.", 
            "Editorial Pearson", "19/06/2020", 300, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\18.png"),
            new Negocios("La mente del emprendedor", "Kevin D. Johnson", 19.50, 280, 
            "Este libro analiza cómo piensan los emprendedores exitosos y cómo aplicar su mentalidad en cualquier negocio.", 
            "Editorial Planeta", "21/05/2021", 280, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\19.png"),
            new Negocios("El líder que no tenía cargo", "Robin Sharma", 16.00, 224, 
            "Una historia inspiradora sobre liderazgo y el poder de las decisiones personales para impactar el mundo.", 
            "Editorial Paidós", "03/09/2020", 224, "Español", "C:\\Users\\angel\\OneDrive\\Imágenes\\IMAGENES.NEGOCIOS\\20.png")

        };

        // Crear la ventana principal
        new listaLibroN(libros);
    }
}
