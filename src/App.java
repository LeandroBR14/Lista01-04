import java.util.Scanner;

public class App {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.println("Qual sua nota na primeira prova?");
    double nota1 = teclado.nextDouble();

    System.out.println("Qual sua nota na segunda prova?");
    double nota2 = teclado.nextDouble();

    System.out.println("Qual sua nota na terceira prova?");
    double nota3 = teclado.nextDouble();

    System.out.println("Qual sua nota na quarta prova?");
    double nota4 = teclado.nextDouble();

    double notatotal = nota1 + nota2 + nota3 + nota4;
    double medianota = notatotal / 4;

    System.out.println("A média das suas notas é de: " +medianota);
    teclado.close();
    }
}