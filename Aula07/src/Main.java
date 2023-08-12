public class Main {
    public static void main(String[] args) {
        // Criando vetores de classe
        Lutador l[] = new Lutador[6];
        // Lutadores leves
        /// Pretty Boy
        l[0] = new Lutador("Pretty Boy","França",31,1.75f,68.9f,11,2,1);
        /// Putscript
        l[1] = new Lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
        // Lutadores médios
        /// Snapshadow
        l[2] = new Lutador("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);
        /// Dead Code
        l[3] = new Lutador("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
        // Lutadores pesados
        /// Pretty Boy
        l[4] = new Lutador("Ufocobol","Brasil",37,1.70f,119.3f,5,4,3);
        /// Nerdaard
        l[5] = new Lutador("Nerdaard","EUA",30,1.81f,105.7f,12,2,4);

        // Criar evento
        /// luta entre pesos leves
        Luta uecleve = new Luta();
        uecleve.marcarLuta(l[0], l[1]);
        uecleve.lutar();
        /// luta entre pesos leves
        Luta uecmedio = new Luta();
        uecmedio.marcarLuta(l[2], l[3]);
        uecmedio.lutar();
        /// luta entre pesos leves
        Luta uecpesado = new Luta();
        uecpesado.marcarLuta(l[0], l[4]);
        uecpesado.lutar();
        uecpesado.marcarLuta(l[5], l[4]);
        uecpesado.lutar();
        /// luta entre pesos leves
        Luta uecleve1 = new Luta();
        uecleve1.marcarLuta(l[1], l[1]);
        uecleve1.lutar();
        /// luta entre pesos leves
        Luta uecmedio1 = new Luta();
        uecmedio1.marcarLuta(l[3], l[2]);
        uecmedio1.lutar();
        /// luta entre pesos leves
        Luta uecleve2 = new Luta();
        uecleve2.marcarLuta(l[0], l[1]);
        uecleve2.lutar();
    }
}