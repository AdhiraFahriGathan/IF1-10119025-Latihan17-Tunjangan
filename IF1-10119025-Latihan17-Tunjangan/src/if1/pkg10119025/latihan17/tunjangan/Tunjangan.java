/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author User
 * 
 */
public class Tunjangan {
    double tunjangan = 0.35;    
    static Tunjangan tnj = new Tunjangan();
    /**
     * @param args the command line arguments
     */        
    private void hitungGaji(int gaji, String status){                                
        tnj.tampilGaji(gaji, ((status.equals("Menikah")) ? gaji * tunjangan : 0));
    }
    
    private void tampilGaji(int gaji, double outTunjangan){
        System.out.println("====Hasil Perhitungan Gaji Anda====");        
        System.out.println("Gaji Pokok\t\t:"+gaji);        
        System.out.println("Tunjanga\t\t:"+outTunjangan);        
        System.out.println("Total Gaji\t\t:"+(gaji+outTunjangan));        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here        
        Scanner scan = new Scanner(System.in);
        System.out.println("=====Program Tunjangan====");        
        System.out.print("Berapa gaji anda perbulan ? \t: Rp. ");
        String input_gaji = scan.next();        
        System.out.print("Status Anda? (Menikah/Belum) \t: ");        
        String status = scan.next();           
        
        int gaji = Integer.parseInt(input_gaji);
        tnj.hitungGaji(gaji, status);
    }    
}
