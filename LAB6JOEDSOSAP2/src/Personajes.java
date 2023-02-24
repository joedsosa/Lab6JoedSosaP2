/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joeds
 */
public class Personajes {
    private String nombre, poder,debilidad,universo;
    private double fuerza,agifis,agimen,hp;
    private int bandera;
    

    public Personajes() {
    }
    public Personajes(String nombre, int bandera){
        this.nombre=nombre;
        this.bandera=bandera;
    }

    public Personajes(String nombre, String poder, String debilidad, String universo, double fuerza, double agifis, double agimen, double hp) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.universo = universo;
        this.fuerza = fuerza;
        this.agifis = agifis;
        this.agimen = agimen;
        this.hp = hp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getAgifis() {
        return agifis;
    }

    public void setAgifis(double agifis) {
        this.agifis = agifis;
    }

    public double getAgimen() {
        return agimen;
    }

    public void setAgimen(double agimen) {
        this.agimen = agimen;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        if(bandera!=0){
            return nombre;
        }
        return  "Nombre: "+nombre+
                "\nUniverso: "+universo+
                "\nPoder: "+poder+
                "\nDebilidad: "+debilidad+
                "\nFuerza: "+fuerza+
                "\nAgilidad Fisica: "+agifis+
                "\nAgilidad mental: "+agimen+
                "\nPuntos de vida: "+hp;
        
    }
    

}
