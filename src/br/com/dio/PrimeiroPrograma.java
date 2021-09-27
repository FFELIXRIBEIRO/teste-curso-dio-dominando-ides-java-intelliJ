package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    private static Object Livro;

    public static void main(String[] args) {

        Gato gato;
        gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("o problema dos 3 corpos" , 300);
        System.out.println(livro1);


   /*  int a = 5;
     int b = 3;
     System.out.println("hello word! " + (a+b));*/
}

}
class Livro<integer> {
    private String nome;
    private integer numPaginas;

    public Livro(String nome, integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}

