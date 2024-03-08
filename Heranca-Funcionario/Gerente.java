public class Gerente extends Funcionarios {
   private Float bonus;

   public Gerente(String nome, Integer idade, Float salario, Float bonus) {
      super(nome, idade, salario);
      this.bonus = bonus;
   }

   public Float getBonus() {
      return bonus;
   }

   public void setBonus(Float bonus) {
      this.bonus = bonus;
   }
}
