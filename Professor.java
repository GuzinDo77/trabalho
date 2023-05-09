public class Professor extends Funcionario {
    private String diciplina;

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public Professor(String nome, int idade, String endereco, double salario, String diciplina){
        super(nome, idade, endereco, salario);
        this.diciplina = diciplina;
    }

    public Professor(){

    }
    }