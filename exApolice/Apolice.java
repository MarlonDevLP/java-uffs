public class Apolice {
    int numApolice;
    String nomeSegurado;
    int idade;
    float valorPremio;
    static int ultimoNumApolice = 0;

    Apolice(){
        Apolice.ultimoNumApolice++;
        this.numApolice = ultimoNumApolice;
    }
    public Apolice(String nomeSegurado, int idade, float valorPremio) {
        Apolice.ultimoNumApolice += 1;
        this.numApolice = ultimoNumApolice;
        this.nomeSegurado = nomeSegurado;
        this.idade = idade;
        this.valorPremio = valorPremio;
    }
    public void imprimir(){
        System.out.println("Número do Apolice: " + this.numApolice);
        System.out.println("Nome: " + this.nomeSegurado);
        System.out.println("Idade: " + this.idade);
        System.out.println("Valor do Prêmio: " + this.valorPremio);
    }
    public void calcularPremio() {
        if (idade >= 18 && idade <= 25){
           valorPremio = (float) (valorPremio * 1.2);
        }
        else if (idade > 25 && idade <= 36){
            valorPremio = (float) (valorPremio * 1.15);
        }
        else if (idade > 36){
            valorPremio = (float) (valorPremio * 1.10);
        }   
    }
    public float oferecerDesconto(String cidade){
        if (cidade.equals("Florianópolis")){
            return valorPremio = (float) (valorPremio * 0.95);
        }
        if (cidade.equals("Chapecó")){
            return valorPremio = (float) (valorPremio * 0.94);
        }
        if (cidade.equals("Joaçaba")){
            return valorPremio = (float) (valorPremio * 0.93);
        }
        if (cidade.equals("Joinville")){
            return valorPremio = (float) (valorPremio * 0.92);
        }
        return valorPremio;
    }
    public static void exibeUltimoNum() {
        System.out.println("Ultima apolice: "+ Apolice.ultimoNumApolice);
    }
}   
