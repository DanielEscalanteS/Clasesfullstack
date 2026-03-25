package com.example.bibliotecaduoc.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class libro {
    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private String fechapublicacion;
    private String Autor;



}
    