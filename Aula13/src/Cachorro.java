import java.util.Objects;

public class Cachorro extends Lobo {
    public Cachorro(float peso, int idade, int membros, String cor) {
        super(peso, idade, membros, cor);
    }
    @Override
    public void emitirSom() {
        System.out.println("au! au! au...");
    }

    public void reagir(String frase){
        if (Objects.equals(frase, "positiva")) {
            System.out.println("abanar e latir");
        } else if (Objects.equals(frase, "negativa")) {
            System.out.println("rosnar");
        } else {
            System.out.println("Somente interação do tipo 'positiva' ou 'negativa' são aceitas!");
        }
    }

    public void reagir(int hora){
        if (hora > 0 && hora < 24){
            if (hora > 5 && hora < 12){
                System.out.println("abanar");
            } else if (hora < 18) {
                System.out.println("abanar e latir");
            } else {
                System.out.println("ignorar");
            }
        } else System.out.println("Escolha uma hora entre 0 e 23");

    }

    public void reagir(boolean dono){
        if (dono){
            System.out.println("abanar");
        } else {
            System.out.println("rosnar e latir");
        }
    }

    public void reagir(){
        if (this.idade >= 0 && this.idade <= 5 && this.peso >= 0f){
            if (this.peso <= 10f){
                System.out.println("novo e leve: abanar");
            }else {
                System.out.println("novo e pesado: latir");
            }
        } else if(this.idade > 5 && this.peso >= 0f){
            if (this.peso <= 10f){
                System.out.println("velho e leve: rosnar");
            }else {
                System.out.println("velho e pesado: ignorar");
            }
        } else System.out.println("Só é permitido valores positvos para idade e peso");
    }
}
