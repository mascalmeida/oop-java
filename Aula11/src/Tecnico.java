public class Tecnico extends Aluno {
    private boolean registro;

    public Tecnico(String nome, int idade, String sexo, boolean matricula, String curso, boolean registro) {
        super(nome, idade, sexo, matricula, curso);
        this.registro = registro;
    }

    public boolean isRegistro() {
        return registro;
    }

    public void setRegistro(boolean registro) {
        this.registro = registro;
    }

    public void praticar(){
        if (this.isRegistro()){
            System.out.println("You are working very well. Great job!");
        } else {
            System.out.println("You have to activate your registry first!");
        }

    }
}
