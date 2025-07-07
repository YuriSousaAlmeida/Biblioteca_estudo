public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", "George Orwell");
        Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien");

        Usuario usuario1 = new Usuario("Alice");
        Usuario usuario2 = new Usuario("Bruno");

        usuario1.emprestarLivro(livro1); // Deve funcionar
        usuario1.emprestarLivro(livro2); // Deve avisar que já tem um livro

        usuario2.emprestarLivro(livro1); // Deve avisar que livro está emprestado

        usuario1.devolverLivro(); // Deve devolver
        usuario2.emprestarLivro(livro1); // Agora deve funcionar
    }
}
