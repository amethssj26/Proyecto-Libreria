package cultura;
public class cultura { 

    private String titulo; 

    private String autor; 

    private double precio; 

    private int cantidadEnStock; 

    private String descripcion; 

    private String editorial; 

    private String fechaPubli; 

    private int numP; // Número de páginas 

    private String idioma; 

    private String rutaImagenPortada; 

 

    // Constructor 

    public cultura(String titulo, String autor, double precio, int cantidadEnStock, String descripcion, String editorial, String fechaPubli, int numP, String idioma, String rutaImagenPortada) { 

        this.titulo = titulo; 

        this.autor = autor; 

        this.precio = precio; 

        this.cantidadEnStock = cantidadEnStock; 

        this.descripcion = descripcion; 

        this.editorial = editorial; 

        this.fechaPubli = fechaPubli; 

        this.numP = numP; 

        this.idioma = idioma; 

        this.rutaImagenPortada = rutaImagenPortada; 

    } 

 

    // Métodos Getter 

    public String getTitulo() { return titulo; } 

    public String getAutor() { return autor; } 

    public double getPrecio() { return precio; } 

    public int getCantidadEnStock() { return cantidadEnStock; } 

    public String getDescripcion() { return descripcion; } 

    public String getEditorial() { return editorial; } 

    public String getFechaPubli() { return fechaPubli; } 

    public int getNumP() { return numP; } 

    public String getIdioma() { return idioma; } 

    public String getRutaImagenPortada() { return rutaImagenPortada; } 

} 

 