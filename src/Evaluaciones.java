import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalevaluacines = 0;

        while (nota != -1) {
            System.out.println("escribe la nota que le darias a la pelicula matrix");
            nota = teclado.nextDouble();
            if (nota != -1) {
                mediaEvaluaciones += nota;
                totalevaluacines++;
            }
        }
        System.out.println("la media de evaluaciones para Matrix es:" + mediaEvaluaciones / totalevaluacines);

    }
}
