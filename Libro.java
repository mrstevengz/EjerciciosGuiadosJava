//Implementar una clase Libro con atributos titulo, autor y numPaginas. Crear un método que devuelva una descripción del libro.

public class Libro {
    String titulo;
    String autor;
    int numPaginas;

    public String descripcionLibros() {
        return "Descripcion de libro: [Titulo: " + titulo + " Autor: " + autor + " Numero de paginas: " + numPaginas + ']';
    }
}


