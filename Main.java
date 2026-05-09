public class Main {
    public static void main(String[] args) {
        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");

        // Criando os personagens para o exemplo de saída
        Personagem heroi1 = new Mago("Eldoran", "Mago", 7, 60, 18.0);
        Personagem heroi2 = new Guerreiro("Arthemis", "Guerreiro", 5, 80, 12.5);

        // --- Exibindo Herói 1 ---
        System.out.println("\n--- Herói 1 ---");
        heroi1.exibirStatus();
        heroi1.usarHabilidadeEspecial();
        System.out.println(heroi1.toString());

        // --- Exemplo de Comparação (equals) ---
        System.out.print("\nComparação: " + heroi1.getNome() + " e " + heroi2.getNome());
        if (heroi1.equals(heroi2)) {
            System.out.println(" são iguais.");
        } else {
            System.out.println(" são diferentes.");
        }

        // Mensagem de Encerramento mantida
        System.out.println("\n********************");
        System.out.println("*     Fim do Jogo!     *");
        System.out.println("********************");
        System.out.println("Aluno: Emmanuel Américo Barros");
        System.out.println("Curso: Sistemas de Informação");
    }
}
