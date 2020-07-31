/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.model;

import java.util.Date;

/**
 *
 * @author Nel
 */
public class Item {
    
    private Integer codItem;
    private Double preco;
    private String tipo;
    private Date dataLocacao;
    private Date dataDevolucao;
    private Filme filme;
    private Cliente cliente;
    
}
