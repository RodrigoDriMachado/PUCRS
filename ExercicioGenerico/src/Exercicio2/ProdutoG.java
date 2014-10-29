package Exercicio2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12280437
 */
public class ProdutoG <T> {

    private T codigo;
    private String descricao;
    private double preco;

    public ProdutoG(T cd, String descr, double pr) {
        this.codigo=cd;
        descricao = descr;
        preco = pr;
    }

  
    public T getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "ProdutoG{" + "codigo=" + codigo + ", descricao="
                + descricao + ", preco=" + preco + '}';
    }
}
