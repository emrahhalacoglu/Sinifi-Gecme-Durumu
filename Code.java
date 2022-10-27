import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        //değişkenler tanımlandı.
        double mat,turkce,fizik,kimya,tarih,muzik,dersSayisi=0;
        double notToplami;
        double notOrtalamasi;
        try (//scanner sınıfı tanımlandı.
        Scanner input = new Scanner(System.in)) {
            //input istemleri yapılıyor.
            System.out.print("Matematik Notunuzu Giriniz:");
            mat= input.nextInt();
            System.out.print("Türkçe Notunuzu Giriniz:");
            turkce= input.nextInt();
            System.out.print("Fizik Notunuzu Giriniz:");
            fizik= input.nextInt();
            System.out.print("Kimya Notunuzu Giriniz:");
            kimya= input.nextInt();
            System.out.print("Tarih Notunuzu Giriniz:");
            tarih= input.nextInt();
            System.out.print("Müzik Notunuzu Giriniz:");
            muzik= input.nextInt();
        }
        
        
        //ortalama hesap işlemi yapiliyor.
        
        if(mat>=0 && mat<=100){
            dersSayisi+=1;mat=mat;}else{
            mat=0;}
        if(turkce>=0 && turkce<=100){
            dersSayisi+=1;turkce=turkce;}else{
            turkce=0;}
        if(fizik>=0 && fizik<=100){
            dersSayisi+=1;fizik=fizik;}else{
            fizik=0;}
        if(kimya>=0 && kimya<=100){
            dersSayisi+=1;kimya=kimya;}else{
            kimya=0;}
        if(tarih>=0 && tarih<=100){
            dersSayisi+=1;tarih=tarih;}else{
            tarih=0;}
        if(muzik>=0 && muzik<=100){
            dersSayisi+=1;muzik=muzik;}else{
            muzik=0;}                    
      
        System.out.print("Not Ortalamaniz:");
        notToplami=mat+turkce+fizik+kimya+tarih+muzik;
        notOrtalamasi=(notToplami)/dersSayisi;
        System.out.println(notOrtalamasi);
        //Koşul ifadesi girildi.
        boolean k1=notOrtalamasi>=55;
        String str = k1 ? "Sinifi Geçti.":"Sinifta Kaldi.";
        System.out.println(str);}
    }
    

