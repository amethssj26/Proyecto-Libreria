package filoso;

public class MainF {
    public static void main(String[] args) {
        // Crear algunos libros de ejemplo
        filosofia[] libros = new filosofia[] {
        new filosofia("La República", "Platón", 12.00, 30, 
            "Una de las obras más influyentes de la filosofía occidental, que explora la justicia, la política, la moral y la naturaleza humana a través de los diálogos de Sócrates.",
            "Gredos", "380 a.C.", 400, "Español", "C:\\imagenes\\repu.jpg"),
        new filosofia("Crítica de la razón pura", "Immanuel Kant", 25.00, 18, 
            "En esta obra fundamental, Kant aborda las limitaciones y los alcances del conocimiento humano, estableciendo las bases de la filosofía crítica.",
            "Fondo de Cultura Económica", "1781", 800, "Español", "C:\\imagenes\\critica.jpg"),
        new filosofia("Meditaciones", "Marco Aurelio", 10.00, 25, 
            "Las meditaciones de Marco Aurelio son una reflexión profunda sobre la vida, la moral y el deber, basadas en los principios del estoicismo.",
            "Alianza Editorial", "180 d.C.", 220, "Español", "C:\\imagenes\\meditaciones.jpg"),
        new filosofia("El ser y la nada", "Jean-Paul Sartre", 22.00, 20, 
            "Sartre desarrolla su teoría del existencialismo, explorando la libertad individual, la angustia y la responsabilidad personal.",
            "Fondo de Cultura Económica", "1943", 800, "Español", "C:\\imagenes\\elser.jpg"),
        new filosofia("El príncipe", "Nicolás Maquiavelo", 14.00, 28, 
            "Una obra influyente sobre teoría política que analiza cómo los líderes pueden mantener su poder a través de decisiones pragmáticas.",
            "Ediciones Akal", "1513", 140, "Español", "C:\\imagenes\\prin.jpg"),
        new filosofia("El contrato social", "Jean-Jacques Rousseau", 16.00, 22, 
            "Rousseau establece su teoría sobre la voluntad general y la legitimidad del poder político, defendiendo que el gobierno debe actuar en beneficio del pueblo.",
            "Ediciones Istmo", "1762", 250, "Español", "C:\\imagenes\\contrato.jpg"),
        new filosofia("La genealogía de la moral", "Friedrich Nietzsche", 18.00, 15, 
            "Nietzsche critica los valores morales tradicionales y examina los orígenes de la moral cristiana, cuestionando conceptos de culpa y sacrificio.",
            "Ediciones Akal", "1887", 180, "Español", "C:\\imagenes\\moral.jpg"),
        new filosofia("Ética a Nicómaco", "Aristóteles", 12.00, 30, 
            "Una obra fundamental sobre la ética que examina la virtud, el bien supremo (eudaimonía) y cómo alcanzar la felicidad a través de la práctica de la virtud.",
            "Gredos", "340 a.C.", 300, "Español", "C:\\imagenes\\etica.jpg"),
        new filosofia("Ser y tiempo", "Martin Heidegger", 28.00, 17, 
            "Heidegger examina la cuestión del ser a través de un análisis profundo del tiempo y cómo la conciencia humana se relaciona con el mundo.",
            "Ediciones Cátedra", "1927", 500, "Español", "C:\\imagenes\\ser.jpg"),
        new filosofia("La interpretación de los sueños", "Sigmund Freud", 20.00, 24, 
            "Freud explora la importancia de los sueños y la interpretación simbólica de estos como manifestaciones del inconsciente.",
            "Editorial Planeta", "1900", 350, "Español", "C:\\imagenes\\lainter.jpg"),
        new filosofia("Del sentimiento trágico de la vida", "Miguel de Unamuno", 14.99, 12, 
            "Unamuno reflexiona sobre la inmortalidad, el conflicto entre la razón y la fe, y la lucha existencial del ser humano por encontrar sentido en la vida.",
            "Ediciones Alianza", "1912", 320, "Español", "C:\\imagenes\\delsenti.jpg"),
        new filosofia("Así habló Zaratustra", "Friedrich Nietzsche", 16.00, 19, 
            "Nietzsche presenta a Zaratustra, un profeta que predica sobre el 'superhombre', el ideal de superación humana y la trascendencia del individuo.",
            "Alianza Editorial", "1883", 350, "Español", "C:\\imagenes\\asi.jpg"),
        new filosofia("La estructura de las revoluciones científicas", "Thomas S. Kuhn", 24.00, 22, 
            "Kuhn explora cómo las ciencias avanzan a través de revoluciones, cambiando paradigmas, en lugar de un progreso lineal.",
            "Fondo de Cultura Económica", "1962", 260, "Español", "C:\\imagenes\\laes.jpg"),
        new filosofia("El mundo de Sofía", "Jostein Gaarder", 14.00, 27, 
            "Una novela filosófica que introduce a los grandes filósofos a través de las cartas misteriosas que recibe la protagonista, Sofía.",
            "Editorial Planeta", "1991", 400, "Español", "C:\\imagenes\\elmundo.jpg"),
        new filosofia("La fenomenología del espíritu", "Georg Wilhelm Friedrich Hegel", 30.00, 10, 
            "Hegel examina la evolución de la conciencia humana y cómo se desarrolla a través de un proceso dialéctico que une contradicciones.",
            "Editorial Losada", "1807", 700, "Español", "C:\\imagenes\\feno.jpg"),
        new filosofia("El existencialismo es un humanismo", "Jean-Paul Sartre", 16.00, 21, 
            "Sartre defiende su visión del existencialismo como una filosofía de libertad y responsabilidad personal, subrayando la angustia existencial.",
            "Ediciones 1940", "1946", 130, "Español", "C:\\imagenes\\elexi.jpg"),
        new filosofia("La ética protestante y el espíritu del capitalismo", "Max Weber", 20.00, 15, 
            "Weber analiza cómo las ideas religiosas, especialmente el protestantismo, influyeron en el desarrollo del capitalismo moderno.",
            "Fondo de Cultura Económica", "1905", 300, "Español", "C:\\imagenes\\laetica.jpg"),
        new filosofia("Del espíritu de las leyes", "Montesquieu", 18.00, 24, 
            "Montesquieu analiza la estructura de los sistemas políticos y propone la separación de poderes como clave para la libertad y la justicia.",
            "Ediciones Istmo", "1748", 350, "Español", "C:\\imagenes\\delespi.png"),
        new filosofia("El segundo sexo", "Simone de Beauvoir", 22.00, 20, 
            "Beauvoir examina la opresión histórica de las mujeres, analizando la construcción social de su rol y proponiendo formas de emancipación.",
            "Editorial Siglo XXI", "1949", 500, "Español", "C:\\imagenes\\segundo.jpg"),
        new filosofia("El mito de Sísifo", "Albert Camus", 15.50, 14, 
            "Camus explora el absurdo de la vida y la lucha constante del ser humano por encontrar sentido, utilizando el mito de Sísifo como metáfora central.",
            "Ediciones Gallimard", "1942", 200, "Español", "C:\\imagenes\\elmito.jpg")

        };

        // Crear la ventana principal
        new listaLibro(libros);
    }
}
