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
        this.pocoes = 3; // O herói começa com 3 poções
        this.xp = 0; // O herói começa com 0 XP
    }

    public String getNome() {return nome;}
    public int getVidaAtual() {return vidaAtual;}
    public int getAtaque() {return ataque;}
    public int getDefesa() {return defesa;}
    public int getPocoes() {return pocoes;}
    public int getXp() {return xp;}

    public int atacar() {
        int dano = (int) (Math.random() * 10) - 5;
        return ataque + dano; // Dano aleatório entre 1 e o valor de ataque
    }

    public void receberDano(int dano) {
        int danoFinal = dano - defesa;
        if (danoFinal < 1) {
            danoFinal = 1; // O dano não pode ser negativo
        }
        vidaAtual -= danoFinal;
        if (vidaAtual < 0) {
            vidaAtual = 0;// A vida não pode ser negativa
    }
      System.out.println(nome + " recebeu " + danoFinal + " de dano. Vida atual: " + vidaAtual);z
       
    }

    public void usarPocao() {
        if (pocoes > 0) {
            vidaAtual += 20; // Cada poção cura 20 pontos de vida
            if (vidaAtual > vidaMaxima) {
                vidaAtual = vidaMaxima; // A vida não pode exceder o máximo
            }
            pocoes--;
            System.out.println(nome + " usou uma poção. Vida atual: " + vidaAtual + ". Poções restantes: " + pocoes);
        } else {
            System.out.println(nome + " não tem poções restantes!");
        }
    }

    int cura = 30;
    
    public void curar() {
        vidaAtual += cura;
        if (vidaAtual > vidaMaxima) {
            vidaAtual = vidaMaxima;

        }
        pocoes--;
        System.out.println(nome + " usou uma poção. Vida atual: " + vidaAtual + ". Poções restantes: " + pocoes);
            
        }

        public void ganharXp(int xpGanho) {
            xp += xpGanho;
            System.out.println(nome + " ganhou " + xpGanho + " XP. Total de XP: " + xp);
    }
    

    public boolean estaVivo() {
        return vidaAtual > 0;
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida Atual: " + vidaAtual + "/" + vidaMaxima);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa);
        System.out.println("Poções: " + pocoes);
        System.out.println("XP: " + xp);

    }
    
}

