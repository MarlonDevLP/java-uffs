import java.util.Scanner;

public class Teste{
    public static Acampamento[] serzinhos = new Acampamento[10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < serzinhos.length; i++){
            System.out.println("Informe o nome:");
            String nome = sc.next();
            System.out.println("Informe a idade:");
            int idade = sc.nextInt();
            sc.nextLine(); // Limpa a entrada de dados
            System.out.println();
            serzinhos[i] = new Acampamento(nome, idade);
            serzinhos[i].definirEquipe();
        }
        for(int i = 0; i < serzinhos.length; i++){
            System.out.println(serzinhos[i].toString());
            System.out.println();
        }
        sc.close();
    }
}
