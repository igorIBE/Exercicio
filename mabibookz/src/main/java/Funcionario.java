/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Funcionario {

    /**
     * @return the nick
     */
    private String getNick() {
        return nick;
    }

    /**
     * @param nick the nick to set
     */
    private void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * @return the nome
     */
    private String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    private void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the senha
     */
    private String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    private void setSenha(String senha) {
        this.senha = senha;
    }
    private String nick;
    private String nome;
    private String senha;

}
