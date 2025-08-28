public class Estudiante {
    String nombre;
    String matricula;
    double promedio;

    public void checkAverage(double promedio) {
        if (promedio >= 70) {
            System.out.println("El estudiante ha aprobado la clase con un promedio de: " + promedio);
        } else {
            System.out.println("El estudiante ha reprobado la clase con un promedio de : " + promedio);
        }
    }

    public String getPromedio() {
        return "El promedio es de: " + promedio;
    }
}
