public class Main {
    public static void main(String[] args) {
        // Criando o Grupo 1
        Grupo alianca = new Grupo();
        alianca.adicionarPersonagem(new Guerreiro("Arthus", "Guerreiro", 10, 150, 25.0));
        alianca.adicionarPersonagem(new Mago("Elenara", "Mago", 12, 90, 35.5));

        // Criando o Grupo 2
        Grupo horda = new Grupo();
        horda.adicionarPersonagem(new Guerreiro("Maximus", "Guerreiro", 9, 120, 22.0));
        horda.adicionarPersonagem(new Mago("Thalric", "Mago", 11, 100, 30.0));

        // Arena e Batalhas
        Arena arena = new Arena();
        arena.batalharGrupos(alianca, horda);

        // --- MENSAGEM DE ENCERRAMENTO ---
        System.out.println("\n********************");
        System.out.println("*     Fim do Jogo!     *");
        System.out.println("********************");
        System.out.println("Aluno: Emmanuel Américo Barros");
        System.out.println("Curso: Sistemas de Informação");
    }
}
