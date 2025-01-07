import java.util.Scanner;

public class calculadora{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Somar\n2. Subtrair\n3. Multiplicar");
        System.out.println("Escolha uma opção: ");
        int escolha = scanner.nextInt();

        System.out.println("Digite um numero: ");
        float n1 = scanner.nextFloat();

        System.out.println("Digite um numero: ");
        float n2 = scanner.nextFloat();

        
        scanner.close();

        switch (escolha) {
            case 1:
                somar(n1, n2);
                break;
            case 2:
                Subtrair(n1, n2);
                break;
            case 3:
                multiplicar(n1, n2);
                break;
        }

    }

    public static void somar(float n1,float n2){
        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
    }

    public static void Subtrair(float n1,float n2){
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
    }

    public static void multiplicar(float n1,float n2){
        System.out.println(n1 + " x " + n2 + " = " + (n1*n2));        
    }
}

