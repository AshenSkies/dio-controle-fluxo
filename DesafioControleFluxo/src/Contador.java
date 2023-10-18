import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro:");
            int first = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int second = terminal.nextInt();

            try{
                count(first, second);
            }catch (ParametrosInvalidosException exception){
                System.out.println("O primeiro parâmetro deve ser menor que o segundo.");
            }
        }

        
    }

    static void count(int first, int second) throws ParametrosInvalidosException {

        if(first > second) throw new ParametrosInvalidosException("Exceção capturada; O programa foi terminado sem êxito.");

        int count = second - first;
        for (int i = 1; i <= count; i++) {
            System.out.println("Imprimindo valor de número " + i);
        }
    }
}
