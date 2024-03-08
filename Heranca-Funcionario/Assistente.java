public class Assistente extends Funcionarios {
    private Float adicional;

    public Assistente(String nome, Integer idade, Float salario, Float adicional) {
        super(nome, idade, salario);
        this.adicional = adicional;
    }

    public Float getAdicional() {
        return adicional;
    }

    public void setAdicional(Float adicional) {
        this.adicional = adicional;
    }
}
