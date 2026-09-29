import java.util.Scanner;

public class BancoMaster {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeFundo;
        double taxaCDB;
        double tetoRegulatorio = 13.0;
        boolean risco = false;

        System.out.print("Digite o nome do fundo: ");
        nomeFundo = sc.nextLine();

        System.out.print("Digite a taxa de juros do CDB (%): ");
        taxaCDB = sc.nextDouble();

        System.out.println("\n===== RELATÓRIO PRELIMINAR =====");
        System.out.println("Fundo analisado: " + nomeFundo);
        System.out.println("Taxa do CDB: " + taxaCDB + "%");
        System.out.println("Teto regulatório: " + tetoRegulatorio + "%");

        if (taxaCDB > tetoRegulatorio) {
            System.out.println("[ALERTA CRÍTICO] Captação agressiva identificada.");
            risco = true;
        } else {
            System.out.println("[REGULAR] Ativo dentro do limite permitido.");
            risco = false;
        }

        System.out.println("\n===== PARECER FINAL =====");

        if (risco) {
            System.out.println("Parecer do Auditor: Ativo bloqueado para novas emissões.");
        } else {
            System.out.println("Parecer do Auditor: Ativo liberado para comercialização.");
        }

        sc.close();
    }
}