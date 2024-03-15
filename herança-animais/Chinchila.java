public class Chinchila extends Animal {
    private String corPelagem;

    public Chinchila(String nome, int idade, String corPelagem) {
        super(nome, idade);
        this.corPelagem = corPelagem;
    }

    public String getCorPelagem() {
        return corPelagem;
    }

    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor da Pelagem: " + corPelagem);
    }
}
