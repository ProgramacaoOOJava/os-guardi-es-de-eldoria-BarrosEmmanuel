/**
 * Classe abstrata que serve de molde para todos os heróis.
 * O modificador 'abstract' impede que esta classe seja instanciada diretamente.
 */
public abstract class Personagem {
    protected String nome;
    protected String classe;
    protected int nivel;
    protected int pontosDeVida;
    protected double poderBase;

    // Construtor que será chamado pelas subclasses via super()
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Método comum a todos: reaproveitamento de código
    public void exibirStatus() {
        System.out.println("Nome: " + nome + " | Classe: " + classe + 
                           " | Nível: " + nivel + " | PV: " + pontosDeVida);
    }

    // Método abstrato: cada subclasse é OBRIGADA a implementar sua própria versão
    public abstract void usarHabilidadeEspecial();
}
