/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program Cakep
 */
package pbo210116397latihan30cakep;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan30Cakep {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // kode background color
    
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    public static void main(String[] args) {
        String jwb;
        Scanner scn = new Scanner(System.in);
        
        System.out.print(ANSI_RED+ "Kamu " + ANSI_RESET);
        System.out.print(ANSI_GREEN+ "ngerjain sendiri " + ANSI_RESET);
        System.out.print(ANSI_YELLOW+ "latihan 17 sampai " + ANSI_RESET);
        System.out.println(ANSI_BLUE+ "latihan 30 ini? " + ANSI_RESET);
        System.out.print(ANSI_BLUE+ "Jawab " + ANSI_RESET);
        System.out.print(ANSI_RED+ "(Yoi/Enggak) : " + ANSI_RESET);
        jwb = scn.next();
        
        String jawaban = jwb.toUpperCase();
        if (jawaban.equals("YOI")){
            System.out.print(ANSI_RED+ "\nCakep Bener. " + ANSI_RESET);
            System.out.println(ANSI_PURPLE+ " Good Job " + ANSI_RESET);
            
        }else{
            System.out.println(ANSI_RED+ "\nTetep cakep sih. " + ANSI_RESET);
            System.out.println(ANSI_CYAN+ "Sing penting paham konsepnya yee ."
                    + ANSI_RESET);
            System.out.println(ANSI_BLACK+ "Keep the code works dude. " 
                    + ANSI_RESET);
        }
    }
    
}
