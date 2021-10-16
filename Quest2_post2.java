package Quest2;

public class Quest2_post2 {

    public static void main(String[] args){

    	Quest2_post1 p1 = new Quest2_post1("Escutem essa nova música de Joao Gomes", "https://www.youtube.com/watch?v=HnfinlIq7s4");

        p1.curtir();
        p1.curtir();
        p1.curtir();

        System.out.println("\nNumero de curtidas: "+p1.getNumeroCurtidas());

        p1.compartilhar();
        p1.compartilhar();

        System.out.println("\nNumero de compartilhamentos: "+p1.getNumeroCompartilhamentos());
    }
}
