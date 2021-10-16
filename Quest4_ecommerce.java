package Quest4;

public class Quest4_ecommerce {

	    public static void main(String[] args){

	    	Quest4_produto mouse = new Quest4_produto("Mouse", 10, 35.00);

	        System.out.println("\nNome do produto: "+mouse.getNome());
	        System.out.println("Preco: "+mouse.getPreco());

	        mouse.Comprar(1);

	        System.out.println("Quantidade em estoque: "+mouse.getQuantidade());

	        mouse.Comprar(1);

	        System.out.println("Quantidade em estoque: "+mouse.getQuantidade());

	        mouse.Comprar(9);

	        System.out.println("Quantidade em estoque: "+mouse.getQuantidade());
	    }
	}
