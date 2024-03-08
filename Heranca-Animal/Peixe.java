class Peixe extends Animal {
    public String caracteristicas;

    public Peixe(String nome, Float comprimento, int patas, String cor, String ambiente, int velocidade,
            String caracteristicas) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }
}
