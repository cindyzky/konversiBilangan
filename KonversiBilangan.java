package tugasaok;

import java.util.Scanner;
public class KonversiBilangan {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("============================================================================");
    System.out.println("\t\t\tKALKULATOR KONVERSI BILANGAN");
    System.out.println("============================================================================");
    System.out.println("Bilangan apa yang akan dikonversi? (biner/desimal/hexadesimal)");
    String jenisBilangan = in.nextLine();

    if (jenisBilangan.equalsIgnoreCase("biner")){
        System.out.print("Bilangan biner          : ");
        String bilangan = in.nextLine();
        fromBinary(bilangan);
    }else if(jenisBilangan.equalsIgnoreCase("desimal")){
        System.out.print("Bilangan desimal        : ");
        int bilangan = in.nextInt();
        fromDecimal(bilangan);
    }else if(jenisBilangan.equalsIgnoreCase("hexadesimal")){
        System.out.print("Bilangan hexadesimal    : ");
        String bilangan = in.nextLine();
        fromHexadecimal(bilangan);
    }else{
        System.out.println("Konversi tidak dapat dilakukan!!");
    }
    
}

public static void fromBinary(String bilangan){
    int desimal = Integer.parseInt(bilangan, 2);
    System.out.println("Bilangan desimal        : " + desimal);
    String hexa = Integer.toHexString(desimal).toUpperCase();
    System.out.println("Bilangan hexadesimal    : " + hexa);
}

public static void fromDecimal(int bilangan){
    String biner = Integer.toBinaryString(bilangan);
    System.out.println("Bilangan biner          : " + biner);
    String hexa = Integer.toHexString(bilangan).toUpperCase();
    System.out.println("Bilangan hexadesimal    : " + hexa);
}

public static void fromHexadecimal(String bilangan){
    int desimal = Integer.parseInt(bilangan, 16);
    System.out.println("Bilangan desimal        : " + desimal);
    String biner = Integer.toBinaryString(desimal);
    System.out.println("Bilangan biner          : " + biner);
}
}