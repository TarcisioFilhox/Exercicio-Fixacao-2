package Quest4;

public class Quest4_produto {

    private int quantidade; private String nome; private Double preco;

    public Quest4_produto(String nome, int quantidade, double preco){

        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void Comprar(int quantidade){
        if((this.quantidade-quantidade) >= 0) {
            this.quantidade -= quantidade;
        }else{
            this.quantidade = 0;
        }
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
}
