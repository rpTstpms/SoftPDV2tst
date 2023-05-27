package softpdv.data;

import java.util.ArrayList;
import java.util.List;


public class ListaProdutosVenda {
    private static List<ProdutosVenda> lista = new ArrayList<>();
    
    public static List<ProdutosVenda> listar(){
        return lista;
    }
    
    public static void adicionar(ProdutosVenda produtos){
        lista.add(produtos);
    }
    
    public static ProdutosVenda buscarProdutosVenda(int codigo){
        for (ProdutosVenda p : lista){
            if (p.getCodigo() == codigo){         
                return p;
            }
        }
        return null;
    }
}
