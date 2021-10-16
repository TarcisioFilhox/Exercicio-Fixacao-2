package Quest5;

public class Quest5_contato1 {

    private int numero, quant_recebidas, naolidas, enviei, quant_enviadas, all, totalRecebidas; private String nome; String[] mensagem_enviada = new String[500]; String[] mensagensEviadas = new String[500]; String[] allRecebidas = new String[500];

    public Quest5_contato1(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public void enviar_mensagem (String mensagem){
        this.mensagem_enviada[quant_enviadas] = mensagem;
        this.quant_enviadas++;
        System.out.println("\nMensagem enviada");
    }

    public void getQuant_naolidas() {
        System.out.println("\nMensagens não lidas de " + this.nome + ": " + this.quant_recebidas);
    }
    public void mensagensNaoLidas(){
        System.out.println("\nMensagens enviadas por "+this.nome+": \n");
        while(this.quant_recebidas > 0){
            System.out.println(this.mensagensEviadas[this.naolidas]);
            this.naolidas++;
            this.quant_recebidas --;
        }
    }

    public void receber_mensagem (String mensagem){
        this.mensagensEviadas [this.quant_recebidas] = mensagem;
        this.allRecebidas [this.quant_recebidas] = mensagem;
        this.quant_recebidas ++;
        this.totalRecebidas = this.quant_recebidas;
    }

  
}
