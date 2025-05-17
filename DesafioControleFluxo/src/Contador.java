import java.util.Scanner;

/**
 * Classe responsável por realizar a contagem entre dois números.
 */
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } catch (Exception e) {
            // Tratamento para entradas inválidas
            System.out.println("Erro: Entrada inválida. Por favor, insira números inteiros.");
        } finally {
            terminal.close(); // Fechar o Scanner
        }
    }

    /**
     * Realiza a contagem entre dois números, lançando uma exceção se os parâmetros forem inválidos.
     *
     * @param parametroUm   O primeiro número.
     * @param parametroDois O segundo número.
     * @throws ParametrosInvalidosException Se o primeiro número for maior que o segundo.
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i <= contagem; i++) {
            System.out.println("IMPRIMINDO O NÚMERO: " + i);
        }
    }
}