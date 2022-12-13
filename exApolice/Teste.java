import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Apolice ap = new Apolice();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        ap.nomeSegurado = sc.next();
        System.out.println("Digite a Idade: ");
        ap.idade = sc.nextInt();
        System.out.println("Digite o Valor do Premio: ");
        ap.valorPremio = sc.nextFloat();
        System.out.println("Digite a Cidadela: ");
        String cidade = sc.next();

        System.out.println();

        ap.calcularPremio();
        ap.imprimir();

        ap.oferecerDesconto(cidade);
            System.out.println("Valor do premio c/ desconto: "+ ap.valorPremio);

        System.out.println();

        sc.close();
    }
}