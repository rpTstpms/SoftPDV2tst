package softpdv.data;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutos {
    private static List<Produtos> lista = new ArrayList<>();
    
    public static List<Produtos> listar(){
        return lista;
    }
    
    public static void adicionar(Produtos produtos){
        lista.add(produtos);
    }
    
    public static Produtos buscarProdutoCodigo(String codigo, String codigoAdicional){
        for (Produtos p : lista){
            if (p.getCodigo().equals(codigo) || p.getCodigoAdicional().equals(codigoAdicional)){                
                return p;
            }
        }
        return null;
    }
    
}
