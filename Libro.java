package GestionBiblioteca;

import java.time.LocalDate;

public class Libro {
    private String nombre;
    private AutorLibro autor;
    private String editorial;
    private LocalDate fechaPublicacion;
    private GeneroLiterario gl;
    private double precio;
    public Libro(String nombre, AutorLibro autor, String editorial, LocalDate fechaPublicacion,
            double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.gl = autor.getGl();
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public AutorLibro getAutor() {
        return autor;
    }
    public void setAutor(AutorLibro autor) {
        this.autor = autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public GeneroLiterario getGl() {
        return gl;
    }
    public void setGl(GeneroLiterario gl) {
        this.gl = gl;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    @Override
    public String toString() {
        return "Libro [nombre=" + nombre + ", autor=" + autor + ", editorial=" + editorial + ", fechaPublicacion="
                + fechaPublicacion + ", gl=" + gl + ", precio=" + precio + "]";
    }


    

    
}
