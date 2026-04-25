package GestionBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro>lista;

    public Biblioteca() {
        this.lista = new ArrayList<Libro>();
    }

    public void agregarLibro(Libro l){
        lista.add(l);
    }



    public void elminarLibro(String titulo) throws ExcepcioBUscarLibro{
        boolean encontrado=false;
        for (Libro libro : lista) {
            if(libro.getNombre().equals(titulo)){
                lista.remove(libro);
                encontrado=true;
                break;
            }
        }
        if(encontrado==false){
            throw new ExcepcioBUscarLibro("El libro no ha sido encontrado");
        }
    }

    @Override
    public String toString() {
        return "Biblioteca [lista=" + lista + "]";
    }


    



    

}
