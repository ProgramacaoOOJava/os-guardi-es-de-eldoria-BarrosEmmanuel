public class Arena {
    public void batalharGrupos(Grupo g1, Grupo g2) {
        System.out.println("=== INÍCIO DO TORNEIO DE GRUPOS ===");
        
        // Pega o tamanho do menor grupo para evitar erros de índice
        int tamanho = Math.min(g1.getMembros().size(), g2.getMembros().size());

        for (int i = 0; i < tamanho; i++) {
            Personagem p1 = g1.getMembros().get(i);
            Personagem p2 = g2.getMembros().get(i);
            g1.batalhar(p1, p2); // Reutiliza a lógica de batalha do Grupo
        }
    }
}
