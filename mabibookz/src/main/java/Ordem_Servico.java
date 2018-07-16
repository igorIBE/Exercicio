
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Ordem_Servico {

    /**
     * @return the data
     */
    private Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    private void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the valorTotal
     */
    private Double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    private void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
      private Date data;
    private Double valorTotal; 


   
    
}
