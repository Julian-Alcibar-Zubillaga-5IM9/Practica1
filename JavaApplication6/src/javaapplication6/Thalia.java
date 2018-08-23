/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Julian Alcibar Zubillaga
 */
public class Thalia {
String Cancion,Frase,Ridiculez;
int Anio;
boolean Autotune;
     /**
     * @param Anio El Año en donde salio la cancion
     * @param Cancion La Cancion de Thalia
     * @param Frase Frase Epíca de la Cancion
     */
    public Thalia(int Anio, String Cancion, String Frase) {
        this.Anio = Anio;
        this.Cancion = Cancion;
        this.Frase = Frase;
    }
    /**
     * @param Cancion La Cancion de Thalia
     */
    public Thalia(String Cancion) {
        this.Cancion = Cancion;
    }
    /**
     * @param Anio El Año en donde salio la cancion
     * @param Cancion La Cancion de Thalia
     * @param Frase Frase Epíca de la Cancion
     * @param Ridiculez La Ridiculez que hizo
     */
    public Thalia(int Anio, String Cancion, String Frase, String Ridiculez) {
        this.Anio = Anio;
        this.Cancion = Cancion;
        this.Frase = Frase;
        this.Ridiculez = Ridiculez;
    }
    /**
     * @param Anio El Año en donde salio la cancion
     * @param Cancion La Cancion de Thalia
     */
    public Thalia(int Anio, String Cancion) {
        this.Anio = Anio;
        this.Cancion = Cancion;
    }
        /**
     * @param Anio El Año en donde salio la cancion
     * @param Cancion La Cancion de Thalia
     * @param Frase Frase Epíca de la Cancion
     * @param Ridiculez La Ridiculez que hizo
     * @param Autotune Si lo uso o no 
     */
    public Thalia(int Anio,String Cancion, String Frase, String Ridiculez, boolean Autotune) {
        this.Cancion = Cancion;
        this.Frase = Frase;
        this.Ridiculez = Ridiculez;
        this.Anio = Anio;
        this.Autotune = Autotune;
    }

    @Override
    public String toString() {
        return "Thalia{" + "Cancion=" + Cancion + ", Frase=" + Frase + ", Ridiculez=" + Ridiculez + ", Anio=" + Anio + ", Autotune=" + Autotune + '}';
    }
        /**
     * @param Anio El Año en donde salio la cancion
     * @param Cancion La Cancion de Thalia
     * @param Frase Frase Epíca de la Cancion
     * @param Ridiculez La Ridiculez que hizo
     * @param Instagram Espero que se lo cierren 
     */
    


    




}
