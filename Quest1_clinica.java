package Quest1;

public class Quest1_clinica {

    public static void main(String[] args){

    	Quest1_paciente n1 = new Quest1_paciente(1, "Tarcisio de Pinho Silva Filho", "14/04/2005", "Masculino", "Individual", "Sem Alergias", "B-");

        System.out.println("\nCodigo: "+n1.getCodigo());
        System.out.println("Nome: "+n1.getNome());
        System.out.println("Data de nascimento: "+n1.getDataNascimento());
        System.out.println("Sexo: "+n1.getSexo());
        System.out.println("Plano de saúde: "+n1.getPlanoSaude());
        System.out.println("Alergia: "+n1.getAlergia());
        System.out.println("Tipo Sanguíneo: "+n1.getTipoSanguineo()+"\n");

        n1.setNome("Maria Regiane de França Macêdo");
        n1.setDataNascimento("20/12/1982");
        n1.setSexo("Feminino");
        n1.setAlergia("Sem Alergias");
        n1.setTipoSanguineo("B+");
        n1.setCodigo(2);
        n1.setPlanoSaude("Individual");

        System.out.println("\nCodigo: "+n1.getCodigo());
        System.out.println("Nome: "+n1.getNome());
        System.out.println("Data de nascimento: "+n1.getDataNascimento());
        System.out.println("Sexo: "+n1.getSexo());
        System.out.println("Plano de saúde: "+n1.getPlanoSaude());
        System.out.println("Alergia: "+n1.getAlergia());
        System.out.println("Tipo Sanguíneo: "+n1.getTipoSanguineo()+"\n");
    }
}
