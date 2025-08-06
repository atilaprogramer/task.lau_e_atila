public class TesteArmario {
    public static void main(String[] args) {
        Gaveta minhGaveta = new Gaveta("Carro Genérico");
        minhGaveta.abrir();

        Gaveta minhacomoda = new Comoda("Comoda do Quarto");
        minhacomoda.abrir();

        Gaveta meuArmario = new Armario("Armario da Sala");
        meuArmario.abrir();
    }
}