/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisislexico;

/**
 *
 * @author Macbook
 */
public class q26 {
    public static void analisis(char cadena[],int indice){
        System.out.println("q26: indice ="+indice);

        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
            indice++;
            AnalisisLexico.resultadoAnalisis+="<)>"; // se añade al resultado del analisis
            q0.analisis(cadena, indice);

        } else { // Si esta en el ultimo caracter, termina el programa 
            AnalisisLexico.resultadoAnalisis+="<)>"; // se añade al resultado del analisis
            qf.end();
        }
    }
}
