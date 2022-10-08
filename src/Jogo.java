import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public int jogarMoeda() {
        Random sorteiaNum = new Random();

        int valor = sorteiaNum.nextInt(2);

        if (valor == 0) {
            System.out.println("Cara!");
        } else {
            System.out.println("Coroa!");
        }
        return valor;
    }

    public void jogaNovamente() {
        Scanner leitor = new Scanner(System.in);

        int continua;
        System.out.println("Deseja jogar novamente? Digite 1 para continuar e 2 para sair");
        continua = leitor.nextInt();

        while (continua == 2) {
            System.out.println("Saindo...");
            break;
        }

        if (continua == 1) {
            System.out.println("Jogando a moeda novamente...");
            jogarMoeda();
            jogaNovamente();

        }


    }


}

