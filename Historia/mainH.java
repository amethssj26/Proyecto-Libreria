package Historia;


public class mainH {
    public static void main(String[] args) {
        // Crear algunos libros de ejemplo
        historia[] libros = new historia[] {
            new historia("Sapiens: De animales a dioses", "Yuval Noah Harari", 18.99, 25, 
             "Un fascinante recorrido por la historia de la humanidad desde sus orígenes hasta la actualidad, explorando cómo las ideas y los cambios culturales han moldeado nuestra sociedad.",
             "Debate", "2011", 496, "Español", "C:\\imagenes\\deani.jpg"),

new historia("Homo Deus: Breve historia del mañana", "Yuval Noah Harari", 19.50, 20, 
             "Una visión provocadora sobre el futuro de la humanidad, analizando cómo la tecnología y los avances científicos redefinirán nuestras vidas.",
             "Debate", "2015", 448, "Español", "C:\\imagenes\\homo.jpg"),

new historia("El arte de la guerra", "Sun Tzu", 9.99, 30, 
             "Un clásico sobre estrategia militar que ha influido tanto en guerras como en la gestión empresarial moderna.",
             "Alianza Editorial", "500 a.C.", 160, "Español", "C:\\imagenes\\elarte.jpg"),

new historia("Guerra y paz", "León Tolstói", 22.99, 15, 
             "Una monumental obra que narra las vidas entrelazadas de familias rusas durante la invasión napoleónica, explorando amor, guerra y política.",
             "Editorial Planeta", "1869", 1224, "Español", "C:\\imagenes\\guerra.jpg"),

new historia("El siglo de oro español", "John Elliott", 14.50, 12, 
             "Un análisis de la época más gloriosa de España, que abarca sus logros culturales, políticos y militares en los siglos XVI y XVII.",
             "Taurus", "2001", 368, "Español", "C:\\imagenes\\elsiglo.jpg"),

new historia("El origen de las especies", "Charles Darwin", 15.99, 18, 
             "Un texto revolucionario que cambió nuestra comprensión de la vida en la Tierra, planteando la teoría de la evolución por selección natural.",
             "Debolsillo", "1859", 720, "Español", "C:\\imagenes\\elori.jpg"),

new historia("1491: Una nueva historia de las Américas antes de Colón", "Charles C. Mann", 17.99, 22, 
             "Un innovador relato sobre las civilizaciones avanzadas que existían en las Américas antes de la llegada de los europeos.",
             "Debate", "2005", 544, "Español", "C:\\imagenes\\1491.jpg"),

new historia("Los cañones de agosto", "Barbara W. Tuchman", 16.50, 14, 
             "Un relato detallado de los eventos que llevaron al estallido de la Primera Guerra Mundial, con un enfoque en las decisiones políticas y militares.",
             "RBA", "1962", 608, "Español", "C:\\imagenes\\loscanones.jpg"),

new historia("Historia del mundo en 100 objetos", "Neil MacGregor", 20.99, 16, 
             "Una exploración de la historia mundial a través de objetos emblemáticos que han definido diferentes civilizaciones y épocas.",
             "Debate", "2010", 736, "Español", "C:\\imagenes\\lahis.jpg"),

new historia("Imperios del mar", "Roger Crowley", 14.00, 10, 
             "Una narración épica sobre la lucha por el control del Mediterráneo entre el Imperio Otomano y la Europa cristiana en el siglo XVI.",
             "Ático de los Libros", "2008", 456, "Español", "C:\\imagenes\\imperios.jpg"),

new historia("Breve historia del tiempo", "Stephen Hawking", 13.50, 20, 
             "Un viaje por los conceptos fundamentales de la cosmología, desde el Big Bang hasta los agujeros negros, explicado de forma accesible.",
             "Crítica", "1988", 256, "Español", "C:\\imagenes\\breve.jpg"),

new historia("El renacimiento", "Peter Burke", 12.99, 28, 
             "Un análisis profundo sobre el Renacimiento, abordando sus influencias artísticas, políticas y sociales en Europa.",
             "Alianza Editorial", "1998", 288, "Español", "C:\\imagenes\\elre.jpg"),

new historia("El tercer Reich en guerra", "Richard J. Evans", 18.50, 12, 
             "Un estudio exhaustivo sobre cómo el régimen nazi llevó a Alemania al desastre durante la Segunda Guerra Mundial.",
             "Península", "2009", 944, "Español", "C:\\imagenes\\eltercer.jpg"),

new historia("Historia mínima de México", "Daniel Cosío Villegas", 10.99, 24, 
             "Un resumen conciso pero profundo de los eventos más importantes que han definido la historia de México.",
             "El Colegio de México", "1944", 264, "Español", "C:\\imagenes\\historiaminima.jpg"),

new historia("Los orígenes de la civilización", "Gordon Childe", 15.00, 18, 
             "Un análisis de las primeras sociedades humanas, su desarrollo y cómo sentaron las bases de la civilización moderna.",
             "Crítica", "1936", 336, "Español", "C:\\imagenes\\losori.jpg"),

new historia("El corazón de las tinieblas", "Joseph Conrad", 12.50, 20, 
             "Un relato sobre el colonialismo europeo en África, narrado a través del viaje al Congo de un marinero llamado Marlow.",
             "Penguin Classics", "1899", 208, "Español", "C:\\imagenes\\elcora.jpg"),

new historia("La Segunda Guerra Mundial", "Antony Beevor", 19.99, 16, 
             "Un relato exhaustivo sobre la Segunda Guerra Mundial, desde sus raíces políticas hasta los eventos más devastadores del conflicto.",
             "Pasado & Presente", "2012", 1232, "Español", "C:\\imagenes\\lasegunda.jpg"),

new historia("El destino del hombre", "André Malraux", 14.99, 15, 
             "Reflexiones sobre los grandes movimientos históricos y filosóficos que han moldeado el destino de la humanidad.",
             "Cátedra", "1947", 352, "Español", "C:\\imagenes\\eldestino.jpg"),

new historia("Historia de dos ciudades", "Charles Dickens", 11.99, 22, 
             "Un relato sobre las tensiones y transformaciones sociales durante la Revolución Francesa, centrado en las ciudades de Londres y París.",
             "Penguin Classics", "1859", 544, "Español", "C:\\imagenes\\historiade.jpg"),

new historia("España invertebrada", "José Ortega y Gasset", 13.50, 25, 
             "Un ensayo político que analiza los problemas históricos de cohesión y desarrollo en España.",
             "Alianza Editorial", "1921", 256, "Español", "C:\\imagenes\\espana.jpg")

        };

        // Crear la ventana principal
        new listaLibro(libros);
    }
}
