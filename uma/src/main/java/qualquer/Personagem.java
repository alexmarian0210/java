package qualquer;

public class Personagem {

    String nome;
    int vida;
    int ataque;
    int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;

    }

    void exibirStatus() {
        System.out.println("===" + nome + "===");
        System.out.println("vida" + vida);
        System.out.println("ataque: " + ataque);
        System.out.println("defesa: " + defesa);

   
    
}
}
