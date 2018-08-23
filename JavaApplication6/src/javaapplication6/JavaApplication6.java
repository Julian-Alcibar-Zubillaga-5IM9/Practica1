/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Alumno
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thalia Cancion = new Thalia("No se si es amor");
        Thalia Album = new Thalia(2018,"Si no me Acuerdo, no paso");
        Thalia Banda = new Thalia(1985,"Quinceañera","Y ahora empieza...");
        Thalia Storie = new Thalia(2018,"Feliz dia del niño pequeño retoño","Retoño","Su Instaseotries");
        Thalia ReThalia = new Thalia(2016,"Desde es Noche","Creo que puedo caer en una ambicion","Cantar con Maluma", true);
        
        CantanteAbs Cantante = new CantanteAbs() {};
        Cantante.chismes();
        Cantante.colaboracion("Maluma");
        Cantante.concierto(0);
    }
    
}
