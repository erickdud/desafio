import java.util.Scanner;

public class Main {

    
    static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int primeiroParametro = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int segundoParametro = scanner.nextInt();

            if (primeiroParametro > segundoParametro) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            int diferenca = segundoParametro - primeiroParametro;
            for (int i = 1; i <= diferenca; i++) {
                System.out.println("Imprimindo o número " + i);
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        scanner.close();
    }
}
