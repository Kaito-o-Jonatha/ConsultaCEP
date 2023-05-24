package Buscador;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Bem vindo(a)");
        ConsultaCep consultaCep = new ConsultaCep();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o CEP");
        String cep = scanner.nextLine();
        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeraJson geraJson = new GeraJson();
            geraJson.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando programa");
        }
    }
}

