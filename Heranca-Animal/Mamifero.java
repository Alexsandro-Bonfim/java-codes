class Mamifero extends Animal {
    public String alimento;

    public Mamifero(String nome, Float comprimento, int patas, String cor, String ambiente, int velocidade,
            String alimento) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }
}
