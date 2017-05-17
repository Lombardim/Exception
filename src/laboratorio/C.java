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
public class C {
    public int  comprobarLetrasNoNum(Boolean b) throws LabException {
        if (b) {
            throw new LabException("Debe digitar solo números.");
        }
        return 0;
    }
    public int  comprobarNumNoLetras(Boolean b) throws LabException {
        if (b == false) {
            throw new LabException("Debe digitar solo letras.");
        }
        return 0;
    }
}
