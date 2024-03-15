
CÓDIGO MELHORADO
Anderson Alves lima
•
Ontem (editado: Ontem)
Data de entrega: Hoje
Melhore o código do material postado.
EX: Cadastrar mais de um tipo de animal
Comentários da turma
Seus trabalhos
Entregue

Animal.java
Java

Cachorro.java
Java

Canario.java
Java

Chinchila.java
Java

Papagaio.java
Java

Main.java
Java
Comentários particulares
public class Papagaio extends Animal {
    private String corPlumagem;

    public Papagaio(String nome, int idade, String corPlumagem) {
        super(nome, idade);
        this.corPlumagem = corPlumagem;
    }

    public String getCorPlumagem() {
        return corPlumagem;
    }

    public void setCorPlumagem(String corPlumagem) {
        this.corPlumagem = corPlumagem;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor da Plumagem: " + corPlumagem);
    }
}
