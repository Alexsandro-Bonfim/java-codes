public class Canario extends Animal {
    private String corPenas;

    public Canario(String nome, int idade, String corPenas) {
        super(nome, idade);
        this.corPenas = corPenas;
    }

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor das Penas: " + corPenas);
    }
}
