package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String universidades [];
        universidades = new String[5];
        universidades[0]= "ITVH";
        universidades[1]= "ULA";
        universidades[2]= "UAM";
        universidades[3]= "UADM";
        universidades[4]= "UNAM";
//        universidades[5]= "IPN";
//        universidades[6]= "TESCO";
//        universidades[7]= "UnADM";
        for (String universidad : universidades){
            System.out.println(universidad);
        }
    }
}
