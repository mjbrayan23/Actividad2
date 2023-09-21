import java.util.Scanner;

public class Alumno {
    String nombre;
    int[] calificaciones = new int[5];

    // Método para calcular el promedio de las cinco calificaciones
    public double calcularPromedio(int[] calificaciones) {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    // Método para obtener la calificación final del participante
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) { 
            return 'B';
        } else {
            return 'A';
        }
    }

    // Método para imprimir los resultados
    public void imprimirResultados(String nombre, int[] calificaciones, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Alumno alumno = new Alumno();

        System.out.println("Por favor, ingrese el nombre del estudiante:");
        alumno.nombre = scanner.nextLine();

        for (int i = 0; i < alumno.calificaciones.length; i++) {
            System.out.println("Ingrese la calificación " + (i + 1) + ":");
            alumno.calificaciones[i] = scanner.nextInt();
        }

        double promedio = alumno.calcularPromedio(alumno.calificaciones);
        char calificacion = alumno.obtenerCalificacionFinal(promedio);

        alumno.imprimirResultados(alumno.nombre, alumno.calificaciones, promedio, calificacion);

        scanner.close();
    }
}
