package model;

public class Produto {
    private int id;
    private String nome;
    private Double preco;
    private int quantidade;

    public Produto ( String nome, Double preco, int quantidade) {
        this.id= id;
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double setPreco(Double preco) {
        this.preco = preco;

    }
    public int getQuantidade(){
        return quantidade;

    }
    public void setQuantidade
            (int quantidade){
        this.quantidade = quantidade;
    }

}
