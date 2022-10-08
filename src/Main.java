import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo(a) ao Cara ou Coroa!!!");

        Jogo jogador = new Jogo();
        System.out.println("Jogando a moeda...");
jogador.jogarMoeda();
jogador.jogaNovamente();
    }
}

