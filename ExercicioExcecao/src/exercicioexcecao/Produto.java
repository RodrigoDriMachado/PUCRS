package exercicioexcecao;

public class Produto {

    private String codigo;
    private int quantidade;
    private float precoUnitario;
    private String descricao;

    /**
     * Contrutor
     * @param codigo
     * @param quantidade
     * @param precoUnitario
     * @param descricao 
     * @throws IllegalArgumentException se (codigo == null) || (codigo.equals(""))
     */
    public Produto(String codigo, int quantidade, float precoUnitario, String descricao) {
        try {
             setQuantidade(quantidade);
        } catch (IllegalArgumentException e1) {
            System.out.println("Valor da quantidade nao pode ser negativa");
            System.out.println("");
        }
        try {
            setPrecoUnitario(precoUnitario);
        } catch (IllegalArgumentException e2) {
            System.out.println("Valor do precoUnitario nao pode ser negativo ou zerado");
           System.out.println("");
        }
        try {
            setDescricao(descricao);
        } catch (IllegalArgumentException e3) {
            System.out.println("A descricao nao pode ser nula");
             System.out.println("");
        }
        if(codigo == null || codigo.equals("")){
            throw new IllegalArgumentException("Codigo nao pode ser vazio ou nulo");
        }    
    }

    /**
     * Permite alterar a quantidade do produto.
     * @param int quantidade do produto
     * @throws IllegalArgumentException se (quantidade < 0)
     */    
    public void setQuantidade(int quantidade) {
        if(quantidade<0){
            throw new IllegalArgumentException();
        }
        else{
        this.quantidade = quantidade;
        }
        
    }
        
    /**
     * Permite alterar o preco unitario do produto.
     * @param float precoUnitario do produto
     * @throws IllegalArgumentException se (precoUnitario <= 0)
     */    
    public void setPrecoUnitario(float precoUnitario) {
        if(precoUnitario<=0){
            throw new IllegalArgumentException();
        }
        else{
        this.precoUnitario=precoUnitario;
        }
    }
    
    /**
     * Permite alterar a descrição do produto.
     * @param String descricao do produto
     * @throws IllegalArgumentException se (descricao == null) || (descricao.equals(""))
     */
    public void setDescricao(String descricao) {
        if(descricao==null || descricao.equals("")){
            throw new IllegalArgumentException();
        }
        else{
            this.descricao = descricao;
        }
        
    }

    /**
     * Permite aumentar a quantidade do produto.
     * @param int quantidade do produto a ser aumentada
     * @throws IllegalArgumentException se (quantidade < 0)
     */    
    public void aumentaQuantidade(int quantidade) {
        this.quantidade=this.quantidade+quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", quantidade=" + quantidade + ", precoUnitario=" + precoUnitario + ", descricao=" + descricao + '}';
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Produto outroProd = (Produto) o;
        if ( (descricao.equals(outroProd.descricao)) && (codigo.equals(outroProd.codigo)) ) {
            return true;
        } else {
            return false;
        }
    }
}
