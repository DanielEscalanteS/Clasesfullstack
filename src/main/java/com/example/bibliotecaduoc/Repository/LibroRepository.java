package com.example.bibliotecaduoc.Repository;


import com.example.bibliotecaduoc.Model.libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class LibroRepository {
    private List<libro> listaLibros = new ArrayList<>();

    public List<libro> obteneLibros(){

        return listaLibros;
    }

    public libro buscarPorId(int id){
        for (libro libro : listaLibros){

            if (libro.getId()==id){
                return libro;
            }
        }
        return null;

    }

    public libro buscarPorIsbn(String isbn){
        for (libro libro : listaLibros){

            if (libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;

    }

    public libro guardar(Libro lib){
        listaLibros.add(lib);
        return lib;

    }

    public libro actualizar(libro lib){

        int id  =0;
        int idposition = 0;

        return null;

    }
  

    
}
