public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante("Ola", 21, "F");
        v1.fazerNiver();

        Professor p1 = new Professor("Leobino", 50, "M", "IP", 20000f);
        p1.aumento(890f);

        Aluno a1 = new Aluno("Lucca", 25, "F", true, "BI Tec");
        a1.mensalidade();

        Bolsista b1 = new Bolsista("Zé", 17, "M", true, "Nurse", false);
        b1.renovarBolsa();
        b1.renovarBolsa();
        b1.mensalidade();

        Tecnico t1 = new Tecnico("Manu", 20, "F", true, "TI", false);
        t1.praticar();
        t1.setRegistro(true);
        t1.praticar();
    }
}