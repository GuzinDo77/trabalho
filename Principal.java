public class Principal {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Luan", "Rua das oliveras", 17, "Informatica", "5º Semestre");
        Professor prof1 = new Professor("Isaque", 43, "Rua das Tulipas", 12200, "PW2");
        FuncAdm func1 = new FuncAdm("Paulinho", 37, "Rua das Margaridas", 3400, "Admnistrativo", "Bibliotecario");

        System.out.println("Nome do aluno: "+aluno1.getNome());
        System.out.println("Endereço do aluno: "+aluno1.getEndereco());
        System.out.println("Idade do aluno: "+aluno1.getIdade());
        System.out.println("Curso do aluno: "+aluno1.getCurso());
        System.out.println("Semestre do aluno: "+aluno1.getSemestre());
        System.out.println("");

        System.out.println("Nome do professor: "+prof1.getNome());
        System.out.println("Endereço do professor: "+prof1.getEndereco());
        System.out.println("Idade do professor: "+prof1.getIdade());
        System.out.println("Curso do professor: "+prof1.getSalario());
        System.out.println("Semestre do professor: "+prof1.getDiciplina());
        System.out.println("");

        System.out.println("Nome do funcionario: "+func1.getNome());
        System.out.println("Endereço do funcionario: "+func1.getEndereco());
        System.out.println("Idade do funcionario: "+func1.getIdade());
        System.out.println("Curso do funcionario: "+func1.getSalario());
        System.out.println("Semestre do funcionario: "+func1.getSetor());
        System.out.println("Função do funcionario: "+func1.getFuncao());
        System.out.println("");


    }
}