package qualquer;

public class heroi {
    private String nome;
    private int vidaMaxima;
    private int vidaAtual;
    private int ataque;
    private int defesa;
    private int pocoes;
    private int xp;

    public heroi(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vidaMaxima = vida;
        this.vidaAtual = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.pocoes = 3;
        this.xp = 0; 
    }
    public int atacar() {
        int variacao = (int)(Math.random() * 10) - 5;
        return ataque + variacao; 
    }

    public void receberDano(int dano) {
        int danoFinal = dano - defesa;
        if (danoFinal < 0) {
            danoFinal = 0; 
        }
        vidaAtual -= danoFinal;
        if (vidaAtual < 0) {
            vidaAtual = 0; 
        }
        System.out.println(nome + " recebeu " + danoFinal + " de dano. Vida atual: " + vidaAtual);    
    }
    public boolean usarPocao() {
        if (pocoes > 0) {
            vidaAtual += 10; 
            if (vidaAtual > vidaMaxima) {
                vidaAtual = vidaMaxima;
                return true; 
            }

            
            pocoes--;
            System.out.println(nome + " usou uma poção. Vida atual: " + vidaAtual + ". Poções restantes: " + pocoes);
            return true;
        } else {
            System.out.println(nome + " não tem poções restantes!");

  
            return false;

            int cura = 30;
        }


               public void curar(){
        vidaAtual += cura;
        if (vidaAtual > vidaMaxima) {
            vidaAtual = vidaMaxima;
        }
        pocoes--;
        System.out.println(nome + " usou uma poção. Vida atual: " + vidaAtual + ". Poções restantes: " + pocoes);
    }
    
        }
    }

  

 
    public void ganharXP(int quantitade) {
        xp += quantitade;
        System.out.println(nome + " ganhou " + quantitade + " XP. Total de XP: " + xp);
    }

    public boolean estaVivo() {
        return vidaAtual > 0;
    }

    public void exibirStatus() {
        System.out.println("\nNome: " + nome);
        System.out.println("\nVida: " + vidaAtual + "/" + vidaMaxima);
        System.out.println("\nAtaque: " + ataque);
        System.out.println("\nDefesa: " + defesa);
        System.out.println("\nPoções: " + pocoes);
        System.out.println("\nXP: " + xp);
    }
}