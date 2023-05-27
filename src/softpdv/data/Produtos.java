package softpdv.data;


public class Produtos {
    private static int idCodigo = 0;
    private static int idCodigoAdicional = 0;
    private String codigo;
    private String codigoAdicional;
    private String descricao;
    private String secao;
    private String quantidade;
    private String vlCusto;
    private String vlVenda;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoAdicional() {
        return codigoAdicional;
    }

    public void setCodigoAdicional(String codigoAdicional) {
        this.codigoAdicional = codigoAdicional;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getVlCusto() {
        return vlCusto;
    }

    public void setVlCusto(String vlCusto) {
        this.vlCusto = vlCusto;
    }

    public String getVlVenda() {
        return vlVenda;
    }

    public void setVlVenda(String vlVenda) {
        this.vlVenda = vlVenda;
    }

    public static int getIdCodigo() {
        return idCodigo;
    }

    public static void setIdCodigo(int idCodigo) {
        Produtos.idCodigo = idCodigo;
    }

    public static int getIdCodigoAdicional() {
        return idCodigoAdicional;
    }

    public static void setIdCodigoAdicional(int idCodigoAdicional) {
        Produtos.idCodigoAdicional = idCodigoAdicional;
    }
    
}
