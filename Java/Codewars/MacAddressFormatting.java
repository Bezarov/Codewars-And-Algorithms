package Codewars;


import java.util.Scanner;

public class MacAddressFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mac = scanner.nextLine();
        mac = mac.replaceAll("\\W", "");
        System.out.println(macFormatter(mac, ".", 4) + " Cisco");
        System.out.println(macFormatter(mac, ":", 2) + " Windows");
        System.out.println(macFormatter(mac, "-", 2) + " Linux");
    }
    public static String macFormatter(String mac, String symbol, int numberOfWords){
        String result = mac.substring(0, numberOfWords);
        for (int i = numberOfWords; i < mac.length(); i += numberOfWords) {
            result = result.concat(symbol);
            result = result.concat(mac.substring(i, i + numberOfWords));
        }
        return result.toUpperCase();
    }
}
