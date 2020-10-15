/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.review;

/**
 *
 * @author david
 */
public class ParametroNoPositivoException extends Exception {

    /**
     * Creates a new instance of <code>ParametroNoPositivoException</code>
     * without detail message.
     */
    public ParametroNoPositivoException() {
    }

    /**
     * Constructs an instance of <code>ParametroNoPositivoException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ParametroNoPositivoException(String msg) {
        super(msg);
    }
}
