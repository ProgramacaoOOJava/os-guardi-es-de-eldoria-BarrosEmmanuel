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

    public String getNome() { return nome; }
    public int getNivel() { return nivel; }
    public double getPoderBase() { return poderBase; }

    // Método que gera a frase descritiva pedida no exemplo
    @Override
    public String toString() {
        return "O personagem " + nome + " é um " + classe + " de nível " + nivel + ".";
    }

    // Implementação de consistência para comparação (Requisito do projeto)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Personagem outo = (Personagem) obj;
        return nome.equals(outo.nome) && classe.equals(outo.classe);
    }

    @Override
    public int hashCode() {
        return nome.hashCode() + classe.hashCode();
    }

    public abstract void usarHabilidadeEspecial();
    
    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
    }
}
