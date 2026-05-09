public class Main {
    public static void main(String[] args) {

        //Criando os objetos!
        Personagem heroi1 = new Personagem("Arthemis", "Arqueira", 5, 80, 12.5);
        Personagem heroi2 = new Personagem("Thalric", "Mago", 7, 60, 18.2);

        //Exibindo todos os Personagens!
        heroi1.exibirStatus();
        heroi2.exibirStatus();
    }
}
