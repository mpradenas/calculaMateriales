/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraelementos;


public class clasecalculomateriales {
    
    public float calculavolumen(float largo, float ancho, float espesor)
    {
        return (largo*ancho*espesor);
    }
    
    public float calculaSacos(float volumen, int sacos)
    {
      return (volumen * sacos);
    }
    
    public float calculaarido(int nsacos,float cmaterial)
    {
        return (nsacos*cmaterial);
    }
}
