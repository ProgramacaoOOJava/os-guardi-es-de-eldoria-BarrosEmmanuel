import java.util.ArrayList;

public class Grupo {
    private ArrayList<Personagem> membros;

    public Grupo() {
        this.membros = new ArrayList<>();
    }

    public void adicionarPersonagem(Personagem p) {
        membros.add(p);
    }

    public void listarPersonagens() {
        for (Personagem p : membros) {
            System.out.println(p.getNome() + " (Nível: " + p.getNivel() + ")");
        }
    }

    // Método que realiza a lógica da batalha
    public void batalhar(Personagem a, Personagem b) {
        double poderA = a.getNivel() * a.getPoderBase();
        double poderB = b.getNivel() * b.getPoderBase();

        System.out.println("Batalha: " + a.getNome() + " vs " + b.getNome());
        
        if (poderA > poderB) {
            System.out.println(a.getNome() + " venceu! Poder total: " + poderA);
        } else if (poderB > poderA) {
            System.out.println(b.getNome() + " venceu! Poder total: " + poderB);
        } else {
            System.out.println("Empate técnico!");
        }
        System.out.println("-------------------------");
    }

    // Getter para a Arena poder acessar os membros
    public ArrayList<Personagem> getMembros() {
        return membros;
    }
}
