package controller;

@RestController
@RequestMapping("api/produtos")
public class ProdutoController {
    private final ProdutoDao produtoDao;

    public ProdutoDao getProdutoDao() {
        this.produtoDao = produtoDao;
    }
    @GetMapping
    public  List<Produto> listar(){
        return  produtoDao.listarTodos();
    }
    @GetMapping("/{id}")
    public Produto buscar(@PatVariable Long id){
        return produtoDao.buscarPorId(id);
    }
    @PostMapping
    public ResponseEntity<Prouto> criar(@Valid @RequestBody ProdutoRequast request){
        Produto produto = ProdutoDao.criar(request);
        return ReponseEntity.created(URI.create("/api/produtos/" + produto.get.Id())).body(produto);
    }
    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @Valid @RequestBody ProdutoRequest request){
        return produtoDao.atualizar();
    }
    @DeleteMapping("/{id}")
    public ResposeEntity<Void> excluir(@PathVariable Long id) {
        produtoDao.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
