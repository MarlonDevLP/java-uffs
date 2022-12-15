public class Acampamento {
    private String nome;
    private int idade;
    private char equipe;
     
    public Acampamento(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void setNome(String nome) {
    this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setEquipe(char equipe) {
        this.equipe = equipe;
    }
    public char getEquipe(){
        return equipe;
    }
    public void definirEquipe() {
        if(idade >= 6 && idade <= 10);{
            setEquipe('A');
        }
        if (idade >= 11 && idade <= 20){
            setEquipe('B');
        }
        else {
            setEquipe('C');
        }
    }

    public String toString() {
        return "Nome: "+ getNome() + "\nIdade: " + getIdade() + "\nEquipe: " + getEquipe();
    }
}
