package GestionBiblioteca;

public class ExcepcioBUscarLibro extends Exception {

    public ExcepcioBUscarLibro(String message) {
        super(message);
    }

    public String toString(){
        return "Libro no encontrado";
    }
    
}
