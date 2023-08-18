import java.util.Random;
public final class Bolsista extends Aluno {
    private boolean bolsa;

    public Bolsista(String nome, int idade, String sexo, boolean matricula, String curso, boolean bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public boolean isBolsa() {
        return bolsa;
    }

    public void setBolsa(boolean bolsa) {
        this.bolsa = bolsa;
    }
    public final void renovarBolsa(){
        if (this.isBolsa()) System.out.println("Your fellowship is active, you don't need to renew now.");
        else{
            this.setBolsa(true);
            System.out.println("Your fellowship is renewed successfully");
        }
    }
    @Override
    public final void mensalidade(){
        Random rand = new Random();
        int percent = rand.nextInt(3);
        switch (percent) {
            case 0:
                System.out.println("You have to pay 50% of R$ 2000,00/month, so, R$ 1000,00/month");
                break;
            case 1:
                System.out.println("You have to pay 20% of R$ 2000,00/month, so, R$ 400,00/month");
                break;
            case 2:
                System.out.println("You have to pay 0% of R$ 2000,00/month, so, R$ 0,00/month");
                break;
        }

    }
}
