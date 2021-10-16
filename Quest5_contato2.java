package Quest5;

public class Quest5_contato2 {

    public static void main(String[] args){

    	Quest5_contato1 kailan = new Quest5_contato1("Kailan", 998506993);

        kailan.enviar_mensagem("Eae meu brother");

        kailan.getQuant_naolidas();

        kailan.receber_mensagem("Eae man");
        kailan.receber_mensagem("Bora jogar?");
        kailan.receber_mensagem("Tô on");
        kailan.receber_mensagem("Bora um X1?");
        kailan.receber_mensagem("Quem perder paga um coca");

        kailan.getQuant_naolidas();

        kailan.mensagensNaoLidas();

        kailan.getQuant_naolidas();
    }
}
