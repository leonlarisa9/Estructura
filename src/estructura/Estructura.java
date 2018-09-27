/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author Larisa
 */
public class Estructura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              String sListaMensaje = "";
        int nNumeroEstudiantes = 0;
           nNumeroEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese EL numero de Estudiantes : "));
  
        int[] edades = new int[nNumeroEstudiantes];
        int[] edadesordenadas = new int[nNumeroEstudiantes];
        
        
          for (int i = 0; i <= edades.length - 1; i++) {
                edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad del Estudiante  " + (i+1)+ " :" ));
            }
          
          // Instanciar mi Clase Ordenamiento
          // Tipode Nombre de   =  palabra reservada Tipode
          // Dato   Variable    =    new              Dato 
        
            Ordenamiento oClsOrdenamiento = new Ordenamiento();
            
           
            
            
            sListaMensaje = sListaMensaje + "La Lista de Edades Desordenadas es : \n"; 
        //  Impresion 
                for (int i = 0; i <= edades.length - 1 ; i++) {
                    sListaMensaje+= ""+(i+1) + ". " + edades[i] + "\n";
                }
                
               // Ordenando el Arreglo
            edadesordenadas = oClsOrdenamiento.busquedaBinaria(edades);  
       
            // nTipoOrdenamiento
           /*
            switch() {
                case 1:
                    
                    
                    break;
                    
                case 2:
                    break;
                    
                default:
                    break;
            }
             */   
             sListaMensaje = sListaMensaje + "***************************  \n"; 
             sListaMensaje = sListaMensaje + "La Lista de Edades Ordenadas es : \n"; 
        //  Impresion 
                for (int i = 0; i <= edadesordenadas.length - 1 ; i++) {
                    sListaMensaje+= ""+(i+1) + ". " + edadesordenadas[i] + "\n";
                }
            
                JOptionPane.showMessageDialog(null, sListaMensaje);
                
          }
           
    }