package GestionBiblioteca;

import java.time.LocalDate;

public class AutorLibro extends PersonaLibro {
    private GeneroLiterario gl;

    public AutorLibro(String nombre, String apellido, LocalDate fechaNacimiento, GeneroLiterario gl) {
        super(nombre, apellido, fechaNacimiento);
        this.gl = gl;
    }

    public GeneroLiterario getGl() {
        return gl;
    }

    public void setGl(GeneroLiterario gl) {
        this.gl = gl;
    }

    public String toString(){
        return super.toString()+", genero literario "+gl;
    }


}
