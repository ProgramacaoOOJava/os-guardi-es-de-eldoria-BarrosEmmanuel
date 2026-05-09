public class Mago extends Personagem {

    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Mago " + nome + " lança Bola de Fogo!");
    }
}
