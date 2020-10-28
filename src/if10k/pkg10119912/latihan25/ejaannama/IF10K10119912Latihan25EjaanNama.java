    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan25.ejaannama;
import java.util.Scanner;


/**
 *
 * @author hp
 */
public class IF10K10119912Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String text;
        int i, panjang_text;
                
        System.out.print("Masukan nama depan anda untuk di eja : ");
        text = input.next();
        panjang_text = text.length();
        String[] kata = text.split("");
        
        System.out.println("Ejaan untuk " + text + " adalah :");
        
        for(i = 0;i < panjang_text;i++){            
        System.out.println("Hurif ke-" + (i+1) + " : " + kata[i]);        
        }
        
    }
    
}