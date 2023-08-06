/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometri;

public class Lingkaran {
    private double phi;
    private double r,luas,keliling;;

    public Lingkaran( double phi, double r,double luas, double keliling) {
        this.phi = phi;
        this.r =r;
        this.luas = luas;
        this.keliling = keliling;
    }

    public double luas() {
        return luas = 0.5 * phi * r * r;
    }

    public double keliling() {
        return keliling = 2 * phi * r;
    }

}
