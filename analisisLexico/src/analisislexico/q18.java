package analisislexico;

/**
 *
 * @author wolf
 */
public class q18 {
    public static void analisis(char cadena[],int indice){
        System.out.println("q18: indice =" + indice);
        
        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
            if(cadena[indice]=='='){
                AnalisisLexico.resultadoAnalisis+="<:=>"; //Se añade al resultado del analisis
                q0.analisis(cadena, indice+1);
            }
            else {
                qe.analisis(cadena, indice); //Si es el ":" es ultimo caracter es un error
            }
        }
       
        else{ 
                qf.end();
        }
    }
}
