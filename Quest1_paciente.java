package Quest1;

public class Quest1_paciente {

    private int codigo; private String nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo;

    public Quest1_paciente(int codigo, String nome, String data, String sexo, String plano, String alergia, String tipo){

        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = data;
        this.sexo = sexo;
        this.planoSaude = plano;
        this.alergia = alergia;
        this.tipoSanguineo = tipo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getNome (){
        return this.nome;
    }

    public String getDataNascimento (){
        return this.dataNascimento;
    }

    public String getSexo (){
        return this.sexo;
    }

    public String getPlanoSaude (){
        return this.planoSaude;
    }

    public String getAlergia (){
        return this.alergia;
    }

    public String getTipoSanguineo (){
        return this.tipoSanguineo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setDataNascimento (String data) {
        this.dataNascimento = data;
    }

    public void setSexo (String sexo) {
        this.sexo = sexo;
    }

    public void setAlergia (String alergia) {
        this.alergia = alergia;
    }

    public void setTipoSanguineo (String sgl) {
        this.tipoSanguineo = sgl;
    }

    public void setPlanoSaude(String plano){
        this.planoSaude = plano;
    }
}
