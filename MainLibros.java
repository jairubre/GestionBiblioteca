package GestionBiblioteca;

import java.time.LocalDate;

public class MainLibros {
    public static void main(String[] args) {
        AutorLibro a1 = new AutorLibro("Jaime", "Ruiz", LocalDate.of(2001, 11, 23)
        , GeneroLiterario.dramatico);
        AutorLibro a2 = new AutorLibro("Noe", "Soltero", LocalDate.of(2002, 10, 30)
        , GeneroLiterario.lirico);

        Libro l1 = new Libro("null", a1, "null", LocalDate.now(), 20);
        Libro l2 = new Libro("null2", a2, "null2", LocalDate.now(), 300);


        Biblioteca b1 = new Biblioteca();

        b1.agregarLibro(l1);
        b1.agregarLibro(l2);

        System.out.println(b1.toString());
        System.out.println("****************************************+");

        try {
            b1.elminarLibro("null2");
            System.out.println(b1.toString());
        } catch (ExcepcioBUscarLibro e) {
            System.out.println(e);
        }
    }
}
