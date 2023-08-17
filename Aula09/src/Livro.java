public class Livro implements Publicacao {
    private String titulo;
    private Pessoa autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, Pessoa autor, int totPag, int pagAtual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes(){
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor().getNome());
        System.out.println("Total de Páginas: " + this.getTotPag());
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("Aberto: " + this.isAberto());
        System.out.println("Leitor: " + this.leitor.getNome());
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear() {
        System.out.println("Folheando...");
    }

    @Override
    public void avancarPag() {
        if (this.isAberto()) this.setPagAtual(this.getPagAtual() + 1);
        else System.out.println("O livro está fechado.");
    }

    @Override
    public void voltarPag() {
        if (this.isAberto()) this.setPagAtual(this.getPagAtual() - 1);
        else System.out.println("O livro está fechado.");
    }
}
