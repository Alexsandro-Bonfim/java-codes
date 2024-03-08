public class Animal2 {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1.0f, 4, "Cinza", "Floresta", 10);
        Mamifero mamifero = new Mamifero("Leão", 2.0f, 4, "Amarelo", "Savana", 50, "Carne");
        Peixe peixe = new Peixe("Tubarão", 3.0f, 0, "Cinza", "Oceano", 60, "Cartilaginoso");

        System.out.println("Animal:");
        System.out.println("Nome do bicho: " + animal.getNome());
        System.out.println("Comprimento do bicho: " + animal.getComprimento());
        System.out.println("Patas do bicho: " + animal.getPatas());
        System.out.println("Cor do bicho: " + animal.getCor());
        System.out.println("Ambiente do bicho: " + animal.getAmbiente());
        System.out.println("Velocidade: " + animal.getVelocidade());
        System.out.println();

        System.out.println("Mamífero:");
        System.out.println("Nome: " + mamifero.getNome());
        System.out.println("Comprimento: " + mamifero.getComprimento());
        System.out.println("Patas: " + mamifero.getPatas());
        System.out.println("Cor: " + mamifero.getCor());
        System.out.println("Ambiente: " + mamifero.getAmbiente());
        System.out.println("Velocidade: " + mamifero.getVelocidade());
        System.out.println("Alimento: " + mamifero.getAlimento());
        System.out.println();

        System.out.println("Peixe:");
        System.out.println("Nome: " + peixe.getNome());
        System.out.println("Comprimento: " + peixe.getComprimento());
        System.out.println("Patas: " + peixe.getPatas());
        System.out.println("Cor: " + peixe.getCor());
        System.out.println("Ambiente: " + peixe.getAmbiente());
        System.out.println("Velocidade: " + peixe.getVelocidade());
        System.out.println("Características: " + peixe.getCaracteristicas());
    }
}
