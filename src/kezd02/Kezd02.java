/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kezd02;

/**
 *
 * @author user01
 */
public class Kezd02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] t = {5,8,2,5,7,4,7};
        TömbKiír(t);
        t = BeszúrásosRendezés(t);
        TömbKiír(t);
    }
    
    public static void TömbKiír(int[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] BuborékRendezés1(int[] t) {
        
        for (int i = t.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (t[j] > t[j+1]) {
                    int tmp = t[j];
                    t[j] = t[j+1];
                    t[j+1] = tmp;
                }
            }
        }
        
        return t;
    }
    
    public static int[] BuborékRendezés2(int[] t) {
        
        for (int i = t.length - 2; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (t[j] > t[j+1]) {
                    int tmp = t[j];
                    t[j] = t[j+1];
                    t[j+1] = tmp;
                }
            }
        }
        
        return t;
    }
    
    public static int[] BeszúrásosRendezés(int[] tomb) {
        int[] rendezettTomb = tomb;
        
        for (int i = 0; i < tomb.length; i++) {
            rendezettTomb[i] = tomb[Min(tomb, i)];
        }
        
        return rendezettTomb;
    }
    
    public static int Min(int[] t, int hely) {
        int min = hely;
        for (int i = hely + 1; i < t.length; i++) {
            if (t[min] > t[i]) min = i;
        }
        return min;
    }
    
}
