package Quest3;

public class Quest3_aviao2 {

    public static void main(String[] args){

    	Quest3_aviao1 aviao = new Quest3_aviao1(900, 10);

        System.out.println("\nVelocidade: "+aviao.getVelocidade()+" Km/h");
        System.out.println("Altitude: "+aviao.getAltitude()+" Km\n");

        aviao.diminuirAltitude(1);
        aviao.diminuirVelocidade(100);

        System.out.println("\nVelocidade: "+aviao.getVelocidade()+" Km/h");
        System.out.println("Altitude: "+aviao.getAltitude()+" Km\n");
    }
}
