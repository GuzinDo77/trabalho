public class Aluno extends Pessoa {

    private String semestre;
    private String curso;

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getSemestre(){
        return semestre;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public Aluno(String nome, String endereco, int idade, String curso, String semestre){
        super(nome, idade, endereco);
        this.curso = curso;
        this.semestre = semestre;
    }

    public Aluno(){

    }
    }