public class Livro {
    private String titulo;

    private String autor;

    private boolean disponivel;

    public Livro(){

    }

    public Livro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
        disponivel=true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if (disponivel == true) disponivel = false;
        else{
            System.out.println("Livro já está sendo emprestado!");
        }
    }


    public void devolver(){
        if (disponivel==false) disponivel=true;
    }
}
