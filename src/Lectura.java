import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new  Scanner(System.in);
        System.out.println("escribe el nombre de tu pelicula favorita");
        String pelicula = teclado.nextLine();
        System.out.println("ahora escribe la fecha del lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("por ultimo que nota le das a esta pelicula");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
