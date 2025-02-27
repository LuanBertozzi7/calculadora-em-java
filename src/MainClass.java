import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {
        // puxo da classe Scanner para a variavel scanner a ação de ler entradas do usuario no console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        // primeiro numero
        System.out.println("Digite o primeiro numero");
        double firstUserNumber = scanner.nextDouble();
        // segundo numero
        System.out.println("Digite o segundo numero");
        double secondUserNumber = scanner.nextDouble();
        //operação que o usuario deseja
        System.out.println("Digite a operação que deseja");
        String operation = scanner.next();
        double result;
        switch (operation) {
            case "+":
                result = firstUserNumber + secondUserNumber;
                System.out.println("Resultado:" + result);
                break;
            case "-":
                result = firstUserNumber - secondUserNumber;
                System.out.println("Resultado:" + result);
                break;
            case "*":
                result = firstUserNumber * secondUserNumber;
                System.out.println("Resultado:" + result);
                break;
                default:
                System.out.println("Está saida não é válida, é possivel fazer operações com:");
                System.out.println("Somar +");
                System.out.println("Subtrair -");
                System.out.println("Multiplicar *");
        }
        scanner.close();
    }
}
