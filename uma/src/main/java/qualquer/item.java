package qualquer;

public class item {

    private String nome;
    private String descricao;
    private int valor;

    public item(String nome, String descricao, int valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void usar(heroi heroi) {
        if(descricao.equals("cura")) {
            heroi.usarPocao();
            System.out.println(heroi.getNome() + " usou " + nome + " e recuperou vida!");
        }
    }
}
