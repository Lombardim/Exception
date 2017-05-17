/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

/**
 *
 * @author lombardim
 */
public class LabException extends Exception {
    public LabException() {
        super();
    }
      public LabException(String message) {
        super(message);
    }
     public LabException(String message, Throwable cause) {
        super(message, cause);
    }
     public LabException(Throwable cause) {
        super(cause);
    }
}
