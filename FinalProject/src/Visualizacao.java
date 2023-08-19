public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.assitiu();
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }

    public void status(){
        System.out.println(this.toString());
    }

    public void avaliar(){
        System.out.println("The default value is 10");
        this.filme.setAvaliacao(10);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
        System.out.println("The current value is " + nota);
    }

    public void avaliar(float percent){
        int nota = 0;
        if (percent >=0 && percent < 10){
            this.filme.setAvaliacao(nota);
        } else if (percent < 50) {
            nota = 3;
            this.filme.setAvaliacao(nota);
        } else if (percent < 80) {
            nota = 6;
            this.filme.setAvaliacao(nota);
        } else if (percent <= 100) {
            nota = 10;
            this.filme.setAvaliacao(nota);
        } else System.out.println("Please, insert values between 0% and 100%");

        System.out.println("The current value is " + nota);
    }
}
