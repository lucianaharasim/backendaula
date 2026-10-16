import dao.ProdutoDao;
import model.Produto;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        ProdutoDao produtoDao = new ProdutoDao();

        try{
            Produto produto= new Produto(00001L,"Banana Prata",6.50,10);

            produtoDao.criar(produto);
            System.out.println("Criado:" + produto);
           //READ(SELECT por id )
           produtoDao.buscarPorId(produto.getId()) .ifPresent(encontrado ->System.out
                   .println("Encontrado:" + encontrado));
           //UPDATE
            produto.setPreco(5.12);
            produto.setQuantidade(20);
            System.out.println("atualizado: " + produtoDao.atualizar(produto));

            // READ (SELECT *)
            System.out.println("Produtos cadastrados:");
            produtoDao.listarTodos().forEach(System.out::println);

            // DELETE
            System.out.println("Excluido:" + produtoDao.excluir(produto.getId()));
        } catch (SQLException e) {
            System.err.println("Não foi possível acessar o MySQL");
            System.err.println("Mensagem:" + e.getMessage());
            System.err.println("SQLState:" + e.getMessage());
            e.printStackTrace();

        }

    }
}