/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

/**
 *
 * @Autor : Larisa Leon
 * Nombre Clase : Ordenamiento
 * descripcion : Esta clase tendra todos los metodos de ordenamiento posibles
 */
public class Ordenamiento {
    
    
    // metodo de burbuja
public int[] burbuja(int[] p_arreglo)
   {
       
        int aux = 0;
        int[] oArregloOrdenado = new int[p_arreglo.length];
        
        int nTamanioAreglo  = p_arreglo.length;
        
        for (int i = 0; i < nTamanioAreglo - 1; i++) {
            for (int j = 0; j < nTamanioAreglo - 1; j++) {
                if (p_arreglo[j] > p_arreglo[j+1]) {
                    // Intercambiar
                        aux= p_arreglo[j];
                        p_arreglo[j] = p_arreglo[j+1];
                        p_arreglo[j+1]= aux;
                    
                }
            }
        }
        oArregloOrdenado = p_arreglo;
        return oArregloOrdenado;
      
   }
   
   public int[] busquedaBinaria (int p_arreglo[], int elemento){
        int centro, primero, ultimo, valorCentro;
       int[] busquedaBinariaArreglo = new int[p_arreglo.length];
        primero = 0;
        ultimo = p_arreglo.length - 1 ;
        while (primero <= ultimo){
            centro = (primero + ultimo)/2;
            valorCentro = p_arreglo[centro];
            if(elemento==valorCentro){
             
            } else if (elemento < valorCentro){
                    ultimo = centro  - 1;
                } else {
                    primero = centro + 1;
                }
              
            }
            busquedaBinariaArreglo = p_arreglo;
            return busquedaBinariaArreglo;
        }
          
        
   public int [] shell(int [] p_arreglo){
       
       int salto, i, j, k, auxiliar;
       int[] shellArreglo = new int[p_arreglo.length];
       salto =p_arreglo.length/2;
       while(salto >0){
           for (i = salto; i< p_arreglo.length; i ++){
               j = i - salto;
               while ( j>=0){
                k= j + salto;
                if (p_arreglo [j] <= p_arreglo [k]){
                    j= -1;
                } else { 
                    auxiliar = p_arreglo[j];
                    p_arreglo[j] = p_arreglo [k];
                    p_arreglo [k] = auxiliar;
                    j =- salto;
                }
                
              }
               
           }
          salto = salto/2;
           
       }
      shellArreglo = p_arreglo;
        return shellArreglo;
    }     

    int[] busquedaBinaria(int[] edades) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
