/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat5;

/**
 *
 * @author MOKLET-2
 */
public class Lat5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlahBaris = 2;
        int jumlahKolom = 2;
                
        int [][] nilai1 = {{ -5 , 3}, {7 , 2}}; 
        int [][] nilai2 = {{3 , 1 }, {5 , -2}};
        int [][] hasil = new int[2][2];
        
        System.out.println("Matriks A"); //untuk menampilakan matriks A
        
        for(int a = 0; a < jumlahBaris; a++){
            for(int b = 0; b < jumlahKolom; b++){
                System.out.print(nilai1[a][b] +" ");
            }
            System.out.print("");
        }
        
        System.out.println("Matriks B");
        
        for(int x = 0; x<2; x++){
            for(int y = 0; y <2; y++){
                System.out.print(nilai2[x][y] +  " ");
            }
            System.out.println( );
        }
        
        for (int i = 0; i < jumlahBaris; i++){
            for(int j = 0; j < jumlahKolom; j++){
                hasil[i][j] = nilai1[i][j] - nilai2[i][j];
            }
}
        System.out.println("Hasil pengurangan dari Matriks A dan B  = ");
        
        for (int i = 0; i < 2 ; i++){
            for(int j = 0; j< 2 ; j++){
                System.out.println(hasil [i][j] + " ");
            }
            System.out.println();
        }
    }
    }
    
}
