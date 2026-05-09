public class Main {
    public static void main(String[] args) {
        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===\n");

        // Instanciando os heróis
        Personagem heroi1 = new Mago("Eldoran", "Mago", 7, 60, 18.0);
        Personagem heroi2 = new Guerreiro("Arthemis", "Guerreiro", 5, 80, 12.5);

        // --- Exibição Detalhada (Conforme Requisito) ---
        System.out.println("--- Herói 1 ---");
        heroi1.exibirStatus();
        heroi1.usarHabilidadeEspecial();
        System.out.println(heroi1.toString());

        System.out.println("\n--- Herói 2 ---");
        heroi2.exibirStatus();
        heroi2.usarHabilidadeEspecial();
        System.out.println(heroi2.toString());

        // --- Comparação de Objetos ---
        System.out.print("\nComparação: " + heroi1.getNome() + " e " + heroi2.getNome());
        if (heroi1.equals(heroi2)) {
            System.out.println(" são iguais.");
        } else {
            System.out.println(" são diferentes.");
        }

        // --- A GRANDE BATALHA ---
        System.out.println("\n--- RESULTADO DA BATALHA ---");
        
        // Cálculo do Poder Total: nivel * poderBase
        double poderEldoran = heroi1.getNivel() * heroi1.getPoderBase();
        double poderArthemis = heroi2.getNivel() * heroi2.getPoderBase();

        if (poderEldoran > poderArthemis) {
            System.out.println(heroi1.getNome() + " venceu! Poder total: " + poderEldoran);
        } else if (poderArthemis > poderEldoran) {
            System.out.println(heroi2.getNome() + " venceu! Poder total: " + poderArthemis);
        } else {
            System.out.println("A batalha terminou em empate!");
        }

        // Assinatura Final
        System.out.println("\n********************");
        System.out.println("*     Fim do Jogo!     *");
        System.out.println("********************");
        System.out.println("Aluno: Emmanuel Américo Barros");
        System.out.println("Curso: Sistemas de Informação");
    }
}
