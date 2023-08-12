import java.util.Random;
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria()){
            if (l1.getNome() != l2.getNome()){
                this.setAprovada(true);
                this.setDesafiante(l1);
                this.setDesafiado(l2);
                System.out.println("Luta aprovada! " + l1.getNome() + " vs " + l2.getNome() + " na categoria dos pesos " + l1.getCategoria() + "!");
                System.out.println("O desafiante " + l1.getNome() + "! Vai encarar o desafiado " + l2.getNome());
            } else {
                this.setAprovada(false);
                this.setDesafiante(null);
                this.setDesafiado(null);
                System.out.println("Luta reprovada! O desafiante e o desafiado precisam ter nomes diferentes.");
            }
        } else{
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
            System.out.println("Luta reprovada, os lutadores são de categorias diferentes!");
        }
    }

    public void lutar(){
        if (this.isAprovada()){
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> UEC <<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("It's timeeeeee! Conheça os gladiadores desta noite!");
            this.desafiante.apresentar();
            this.desafiado.apresentar();
            // definindo o vencedor
            Random rand = new Random();
            int vencedor = rand.nextInt(2);
            if (vencedor == 2){
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
            } else if (vencedor == 1) {
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
            } else {
                this.desafiante.empatarLuta();
                this.desafiado.empatarLuta();
            }
        } else {
            System.out.println("Está luta está reprovada! Favor atender os critérios de aprovação:");
            System.out.println("1. Lutadores na mesma categoria de peso");
            System.out.println("2. Lutadores com nomes diferentes");
        }

        System.out.println();
    }

}
