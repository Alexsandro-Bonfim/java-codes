public class Funcionarios2 {
        public static void main(String[] args) {

                Funcionarios funcionario = new Funcionarios("João", 30, 2000.0f);
                System.out.println("Funcionário:");
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("Idade: " + funcionario.getIdade());
                System.out.println("Salário: " + funcionario.getSalario());
                System.out.println();

                Gerente gerente = new Gerente("Maria", 35, 3000.0f, 500.0f);
                System.out.println("Gerente:");
                System.out.println("Nome: " + gerente.getNome());
                System.out.println("Idade: " + gerente.getIdade());
                System.out.println("Salário: " + gerente.getSalario());
                System.out.println("Bonus: " + gerente.getBonus());
                System.out.println();

                Assistente assistente = new Assistente("Pedro", 25, 1500.0f, 200.0f);
                System.out.println("Assistente:");
                System.out.println("Nome: " + assistente.getNome());
                System.out.println("Idade: " + assistente.getIdade());
                System.out.println("Salário: " + assistente.getSalario());
                System.out.println("Adicional: " + assistente.getAdicional());
                System.out.println();
        }
}
