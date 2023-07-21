import java.util.Scanner;

public class Faktoriyel{
    public static void main(String[] args) {

        //Kombinasyon hesaplayan program yazınız. C(n,r) = n! / (r! * (n-r)!)
        Scanner sc = new Scanner(System.in);
        int n, r, kombinsayon, nFaktoriyel=1, rFaktoriyel=1, nrFaktoriyel=1;

        System.out.println("İlk sayıyı giriniz: ");
        n= sc.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        r = sc.nextInt();

        for(int i=1; i<=n; i++){
            nFaktoriyel = nFaktoriyel * i;
        }

        for(int j=1; j<=r; j++){
            rFaktoriyel = rFaktoriyel * j;
        }

        for(int k=1; k<=(n-r); k++){
            nrFaktoriyel = nrFaktoriyel * k;
        }

        kombinsayon = nFaktoriyel / (rFaktoriyel * nrFaktoriyel);
        System.out.println("C(" +n+ "," +r+ ") Kombinasyonu: "+kombinsayon);
    }
}