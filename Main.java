public class Main {
    public static void main(String[] args) {
        // Criando Grupo 1
        Grupo grupoLuz = new Grupo();
        grupoLuz.adicionarPersonagem(new Guerreiro("Arthus", 10, 25.0));
        grupoLuz.adicionarPersonagem(new Mago("Elenara", 12, 35.5));

        // Criando Grupo 2
        Grupo grupoTrevas = new Grupo();
        grupoTrevas.adicionarPersonagem(new Guerreiro("Maximus", 9, 22.0));
        grupoTrevas.adicionarPersonagem(new Mago("Thalric", 11, 30.0));

        // Criando a Arena e executando a batalha
        Arena arena = new Arena();
        arena.batalharGrupos(grupoLuz, grupoTrevas);
    }
}
