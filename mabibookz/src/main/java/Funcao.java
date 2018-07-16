/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Funcao {

    /**
     * @return the acessoRestrito
     */
    private boolean isAcessoRestrito() {
        return acessoRestrito;
    }

    /**
     * @param acessoRestrito the acessoRestrito to set
     */
    private void setAcessoRestrito(boolean acessoRestrito) {
        this.acessoRestrito = acessoRestrito;
    }

    /**
     * @return the descricao
     */
    private String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    private boolean acessoRestrito;
    private String descricao;

}
