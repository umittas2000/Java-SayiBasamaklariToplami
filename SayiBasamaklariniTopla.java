import java.util.Scanner;

public class SayiBasamaklariniTopla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long sayi,basamak=0,tempSayi,tempSayi2,toplam=0,basamakOndalik=0;

        System.out.print("Basamaklarini toplamak istedigin sayiyi gir:");
        sayi=input.nextLong();
        tempSayi=sayi;
        tempSayi2=sayi;

        while(tempSayi!=0) {
            tempSayi2 = tempSayi % 10;
            tempSayi /= 10;
            basamak++;
            toplam += tempSayi2;

            basamakOndalik=0;
            for(int i=1;i<=basamak;i++){
                if(basamakOndalik==0){
                    basamakOndalik=1;
                }else {
                    basamakOndalik *= 10;
                }
            }

            System.out.println(basamakOndalik+"ler Basamagi:"+tempSayi2);
        }
        System.out.println("Verilen sayi:"+sayi+ " || Basamaklar Toplami: "+toplam);
    }
}
