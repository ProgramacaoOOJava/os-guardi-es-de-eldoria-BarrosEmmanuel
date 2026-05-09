import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // Criando uma lista genérica de Personagens (ArrayList)
        List<Personagem> grupoDeHerois = new ArrayList<>();

        // Adicionando instâncias das subclasses à lista
        grupoDeHerois.add(new Guerreiro("Arthus", 10, 150, 25.0));
        grupoDeHerois.add(new Mago("Elenara", 12, 90, 35.5));
        grupoDeHerois.add(new Guerreiro("Maximus", 8, 120, 20.0));

        System.out.println("--- INÍCIO DA JORNADA ---" + "\n");

        // Iterando sobre a lista (Polimorfismo em ação)
        for (Personagem heroi : grupoDeHerois) {
            heroi.exibirStatus(); // Chama o método comum
            heroi.usarHabilidadeEspecial(); // Chama o comportamento específico de cada um
            System.out.println(); // Linha em branco para organização visual
        }

        System.out.println("--- FIM DA AVENTURA ---");
    }
}
