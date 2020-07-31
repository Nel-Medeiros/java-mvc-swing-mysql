/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.controller;

import locadora.model.Filme;

/**
 *
 * @author Nel
 */
public class FilmeController {
    
    public boolean cadastrarFilme(String titulo, String genero, String sinopse, Integer duração) {
        
        if(titulo != null 
                && titulo.length() >0 
                && genero != null 
                && genero.length() >0 
                && sinopse != null 
                && sinopse.length() >0 
                && duração != null 
                && duração >0) 
        {
            Filme filme = new Filme(titulo, genero, sinopse, duração);
            filme.cadastrarFilme(filme);
            return true;
        }
        return false;
    }
}
