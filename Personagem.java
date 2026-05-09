/**
 * Classe Personagem atualizada.
 * Os métodos 'get' permitem que a classe Grupo acesse os dados para a batalha.
 */
public abstract class Personagem {
    protected String nome;
    protected String classe;
    protected int nivel;
    protected int pontosDeVida;
    protected double poderBase;

    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // --- MÉTODOS GETTERS (RESOLVEM O SEU ERRO) ---
    
    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public double getPoderBase() {
        return poderBase;
    }

    // --- FIM DOS GETTERS ---

    public void exibirStatus() {
        System.out.println("Nome: " + nome + " | Classe: " + classe + 
                           " | Nível: " + nivel + " | PV: " + pontosDeVida);
    }

    public abstract void usarHabilidadeEspecial();
}
