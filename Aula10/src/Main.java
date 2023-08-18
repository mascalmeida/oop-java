public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Lucas", 28, "M");
        Aluno a = new Aluno("Rosy", 65, "F", true, "Big Data");
        Professor t = new Professor("Rildo", 42, "M", "TI", 15000f);
        Funcionario f = new Funcionario("Joana", 31, "F", "STI", true);
        p.perfil();
        a.perfil();
        t.perfil();
        f.perfil();
        p.fazerAniv();
        a.cancelarMatr();
        t.receberAum(20000f);
        f.mudarTrabalho();
        p.perfil();
        a.perfil();
        t.perfil();
        f.perfil();
    }
}