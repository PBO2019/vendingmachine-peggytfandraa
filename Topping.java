/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopi;

/**
 *
 * @author asus
 */
public class Topping {
    private String jenisTopping;
    private int jumlahstockTopping;
    
    public Topping(){
        System.out.println("");
    }
    public void setjenisTopping(String susu, String gula, String cream){
        String jenisTopping1 = this.jenisTopping;
    }
    public void jumlahstockTopping(int jumlahstockTopping){
        this.jumlahstockTopping = jumlahstockTopping;
    }
    public String getjenisTopping(){
        return jenisTopping;
    }
    public int getjumlahstockTopping(){
        return jumlahstockTopping;
    }

}
