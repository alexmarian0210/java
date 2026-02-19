package qualquer;

public class Main {
    public static void main(String[] args) {

    //Personagem personagem1 = new Personagem("Goku", 100, 50, 30);
      //  Personagem personagem2 = new Personagem("Vegeta", 90, 45, 25);
      //  personagem1.exibirStatus();
      //  personagem2.exibirStatus();

        heroi heroi1 = new heroi("Goku", 100, 50, 30);
        System.out.println("Nome do herói: " + heroi1.getNome());
        System.out.println("Vida atual: " + heroi1.getVidaAtual());
        System.out.println("Ataque: " + heroi1.getAtaque());    
        System.out.println("Defesa: " + heroi1.getDefesa());
        System.out.println("Poções: " + heroi1.getPocoes());
        System.out.println("XP: " + heroi1.getXp());

      
    }
}