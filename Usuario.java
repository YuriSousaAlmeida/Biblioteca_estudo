public class Usuario {
    private String nome;
    private Livro livroEmprestado;

    public Usuario(){

    }

    public Usuario(String nome){
        this.nome=nome;
        this.livroEmprestado=null;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro getLivroEmprestado() {
        return livroEmprestado;
    }

    public void setLivroEmprestado(Livro livroEmprestado) {
        this.livroEmprestado = livroEmprestado;
    }

    public void emprestarLivro(Livro livro){
        if (livroEmprestado==null && livro.isDisponivel()){
            livroEmprestado=livro;
            livroEmprestado.emprestar();
            System.out.println("O livro foi emprestado, você tem até o dia 17/12/2004 para devolver");
        }else{
            System.out.println("A ação de emprestar não pôde ser concretizada");
        }
    }
    // Se o usuário não tiver livro emprestado, tenta pegar emprestado o livro (usar método da classe Livro). Se já tiver um livro, exibe mensagem.

    public void devolverLivro(){
        if (livroEmprestado!=null){
            livroEmprestado.devolver();
            livroEmprestado=null;
            System.out.println("O livro foi devolvido com sucesso!");
        }
    }
    //Devolve o livro emprestado (usar método da classe Livro) e remove a referência.
}
