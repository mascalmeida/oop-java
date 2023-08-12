public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrtoas;
    private int empates;
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrtoas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.definirCategoria(peso);
        this.vitorias = vitorias;
        this.derrtoas = derrtoas;
        this.empates = empates;
    }
    private void definirCategoria(float peso){
        if (peso < 80){
            this.setCategoria("Leve");
        } else if (peso < 100){
            this.setCategoria("Médio");
        } else this.setCategoria("Pesado");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrtoas() {
        return derrtoas;
    }

    public void setDerrtoas(int derrtoas) {
        this.derrtoas = derrtoas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println(this.nome + ", lutador da categoria " + this.categoria + " com o cartel de:");
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println(this.vitorias + " vitorias");
        System.out.println(this.empates + " empates");
        System.out.println(this.derrtoas + " derrotas");
    }

    public void status(){
        System.out.println(this.nome);
        System.out.println("Categoria: " + this.categoria);
        System.out.println(this.vitorias + " vitorias");
        System.out.println(this.empates + " empates");
        System.out.println(this.derrtoas + " derrotas");
    }

    public void ganharLuta(){
        System.out.println("O vencedor é " + this.nome + " incrementando 1 vitória em seu cartel");
        this.setVitorias(this.getVitorias() + 1);
    }
    public void empatarLuta(){
        System.out.println("Decisão por empate! Ninguém leva o prêmio para casa.");
        this.setEmpates(this.getEmpates() + 1);
    }
    public void perderLuta(){
        System.out.println(this.nome + " foi derrotado essa noite, incrementando 1 derrota em seu cartel");
        this.setDerrtoas(this.getDerrtoas() + 1);
    }
}
