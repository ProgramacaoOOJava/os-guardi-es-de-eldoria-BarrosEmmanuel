//Criei a Subclasse Guerreiro.
public class Guerreiro extends Personagem {
    
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        // Chama o construtor da superclasse Personagem
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Guerreiro " + nome + " ataca com Espada Flamejante!");
    }
}
