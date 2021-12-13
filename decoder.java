
package decoder_example;

import java.util.Scanner;

public class decoder_example {

     static Scanner giris = new Scanner(System.in);
    
    public static void main(String[] args) {
      
       
        
        System.out.print("Lütfen kod çözücünün giriş değerlerini (E,x,y,z) (örnek:1000) sırasıyla giriniz:  ");
        String Strsayi = giris.next(); //String olarak sayilari tutuyoruz
     char chrsayi[] = new char[4];
     for(int a=0;a<=3;a++){chrsayi[a]=Strsayi.charAt(a);} //3 bitlik sayi girecegimiz icin uzunlugu 3 olan dizi olusturuyoruz
int toplam =0; //girilen degerin onluk tabanindaki tam sayi olarak tutmasi icin olusturdugum degisken
int sayac= chrsayi.length-2; // 1111 girdigimizde sayac 4-2 defa islem devam edecek

if(chrsayi[0]=='1'){// Eger E==1 ise yapilacak islemler
for(int i=1;i<chrsayi.length;i++){
toplam += (int)(Math.pow(2, sayac)) * (int)(Character.getNumericValue(chrsayi[i])); //desimal degerini hesapliyoruz
sayac--; 
}

    int ikiuzeritoplam = (int)Math.pow(2, toplam); //onluk  tabana cevirdigimiz sayiyi 2 uzeri onluk taban seklinde tutuyoruz.
    String cikisBitleri=""; //metinsel olarak cikis bitlerini gosteren degisken
    
    while(cikisBitleri.length()!=8){ //8 cikis olacagi icin uzunlugu 8den farkli olana kadar devam ettiren dongu 
    cikisBitleri += ikiuzeritoplam%2; // 2lik tabana ceviriyoruz mod kullanarak
    ikiuzeritoplam /= 2; 
        
    }
    System.out.println(toplam + " numaralı çıkış 1 diğer çıkışlar 0 iken;");
    System.out.println("Çıkışlar : "+cikisBitleri);
    }
    
else{ // Eger E == 0 ise 
System.out.println("00000000");
}
    }   
}
