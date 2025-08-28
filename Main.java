public class Main {
    public static void main(String[] args) {
        //Ejercicio 1

        Coche coche = new Coche();
        coche.marca = "Toyota";
        coche.modelo = "Rav 4";
        coche.year = 2025;

        System.out.println(coche.mostrarDatos());

        //Ejercicio 2

        Libro libro = new Libro();
        libro.titulo = "Titulo";
        libro.autor = "Autor";
        libro.numPaginas = 100;

        System.out.println(libro.descripcionLibros());
    }
}