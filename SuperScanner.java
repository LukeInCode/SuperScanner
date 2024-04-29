package input;
import java.util.*;

/**
 * Class which manages in a safe way the keyboard input
 * @author Luke
 * @version 1.0
 */
public class SuperScanner {
    //Attributes
    private final Scanner sc = new Scanner(System.in);

    /**
     * Constructor which use the enter like delimiter
     */
    //Constructor
    public SuperScanner(){
        sc.useDelimiter("\n");
    }

    //Methods

    /**
     * Method which return a byte number insert by keyboard if the condition (if it's an integer number) it's true
     * @return byte inserted
     */
    public int nextInt(){
        boolean check;
        int num = 0;
        do {
            check = true;
            if (sc.hasNextInt()) {
                 check = false;
                 num = sc.nextInt();
            }else {
                sc.nextLine();
                System.out.println("Input not valid");
            }
        }while(check);
        sc.nextLine();
        return num;
    }

    /**
     * Method which return a double number insert by keyboard if the condition (if it's a double number) it's true
     * @return the double number insert
     */
    public double nextDouble(){
        boolean check;
        double num = 0;
        do {
            check = true;
            if (sc.hasNextDouble()) {
                check = false;
                num = sc.nextDouble();
            }else {
                sc.nextLine();
                System.out.println("Input not valid");
            }
        }while(check);
        sc.nextLine();
        return num;
    }

    /**
     * Method which return a float number insert by keyboard if the condition (if it's an integer number) it's true
     * @return the float number inserted
     */
    public float nextFloat(){
        boolean check;
        float num = 0;
        do {
            check = true;
            if (sc.hasNextFloat()) {
                check = false;
                num = sc.nextFloat();
            }else {
                sc.nextLine();
                System.out.println("Input not valid");
            }
        }while(check);
        sc.nextLine();
        return num;
    }

    /**
     * Method which return a long number insert by keyboard if the condition (if it's an integer number) it's true
     * @return the long number inserted
     */
    public long nextLong(){
        boolean check;
        long num = 0;
        do {
            check = true;
            if (sc.hasNextLong()) {
                check = false;
                num = sc.nextInt();
            }else {
                sc.nextLine();
                System.out.println("Input not valid");
            }
        }while(check);
        sc.nextLine();
        return num;
    }

    /**
     * Method which return a byte number insert by keyboard if the condition (if it's an integer number) it's true
     * @return the byte number inserted
     */
    public byte nextByte(){
        boolean check;
        byte num = 0;
        do {
            check = true;
            if (sc.hasNextByte()) {
                check = false;
                num = sc.nextByte();
            }else {
                sc.nextLine();
                System.out.println("Input not valid");
            }
        }while(check);
        sc.nextLine();
        return num;
    }

    /**
     * Method which return the boolean inserted
     * @return the boolean character inserted
     */
    public boolean nextBoolean(){
        boolean check;
        boolean res;
        do {
            check = true;
            if (sc.hasNextBoolean()) {
                check = false;
                res = sc.nextBoolean();
            }else {
                sc.nextLine();
                res = false;
                System.out.println("Input not valid");
            }
        }while(check);
        sc.nextLine();
        return res;
    }

    /**
     * Method which return a short number insert by keyboard if the condition (if it's an integer number) it's true
     * @return the short number inserted
     */
    public short nextShort(){
        boolean check;
        short num = 0;
        do {
            check = true;
            if (sc.hasNextShort()) {
                check = false;
                num = sc.nextShort();
            }else {
                sc.nextLine();
                System.out.println("Input not valid");
            }
        }while(check);
        sc.nextLine();
        return num;
    }

    /**
     * Method which return the character inserted by keyboard if the condition (if it's an integer number) it's true
     * @return the character inserted
     */
    public char nextChar(){
        String in;
        boolean check;
        char c = ' ';
        do {
            in = sc.nextLine();
            check = true;
            if (in.length() == 1) {
                check = false;
                c = in.charAt(0);
            }else{
                sc.nextLine();
                System.out.println("Input not valid");
            }
        }while(check);
         return c;
    }


    /**
     * Method which close the scanner
     */
    public void close(){sc.close();}


    /**
     * Method which return the string inserted by keyboard
     * @return the string inserted
     */
    public String nextLine(){
        return sc.nextLine();
    }

    /**
     * method which return a byte number in a range, it'll ask for a new insert while the condition is respected
     * @param min min value
     * @param max max value
     * @return a byte number inserted in the range [min,max]
     */
    //Overloaded methods
    public int nextInt(int min, int max){ //Method for verify if the number inserted is in the range [min,max]
        int num;
        boolean check;
        do{
            check = true;
            num = nextInt();
            if(num >= min && num <= max){
                check = false;
            }else{
                System.out.println("The number insert isn't in the range [min,max]");
            }
        }while(check);
        return num;
    }


    /**
     * Method which return a float number insert by keyboard if it's in the range
     * @param min min value
     * @param max max value
     * @return the float inserted if it's in the range [min,max], else the user will insert again
     */
    public float nextFloat(float min, float max){ //Method for verify if the number inserted is in the range [min,max]
        float num;
        boolean check;
        do{
            check = true;
            num = nextFloat();
            if(num >= min && num <= max){
                check = false;
            }else{
                System.out.println("The number insert isn't in the range [min,max]");
            }
        }while(check);
        return num;
    }

    /**
     * Method which return a double number insert by keyboard if it's in the range
     * @param min min value
     * @param max max value
     * @return the double insert if it's in the range [min,max], else the user will insert again
     */
    public double nextDouble(double min, double max){ //Method for verify if the number inserted is in the range [min,max]
        double num;
        boolean check;
        do{
            check = true;
            num = nextDouble();
            if(num >= min && num <= max){
                check = false;
            }else{
                System.out.println("The number insert isn't in the range [min,max]");
            }
        }while(check);
        return num;
    }

    /**
     * Method which return a long number insert by keyboard if it's in the range
     * @param min min value
     * @param max max value
     * @return the long insert if it's in the range [min,max], else the user will insert again
     */
    public long nextLong(long min, long max){ //Method for verify if the number inserted is in the range [min,max]
        long num;
        boolean check;
        do{
            check = false;
            num = nextLong();
            if(num >= min && num <= max){
                check = true;
            }else{
                System.out.println("The number insert isn't in the range [min,max]");
            }
        }while(check);
        return num;
    }

    /**
     * Method which return a short number insert by keyboard if that's in the range
     * @param min min value
     * @param max max value
     * @return the short insert if it's in the range [min,max], else the user will insert again
     */
    public short nextShort(short min, short max){ //Method for verify if the number inserted is in the range [min,max]
        short num;
        boolean check;
        do{
            check = false;
            num = nextShort();
            if(num >= min && num <= max){
                check = true;
            }else{
                System.out.println("The number insert isn't in the range [min,max]");
            }
        }while(check);
        return num;
    }

    /**
     * Method which return a byte number insert by keyboard if that's in the range
     * @param min min value
     * @param max max value
     * @return the byte insert if it's in the range [min,max], else the user will insert again
     */
    public byte nextByte(byte min, byte max){ //Method for verify if the number inserted is in the range [min,max]
        byte num;
        boolean check;
        do{
            check = false;
            num = nextByte();
            if(num >= min && num <= max){
                check = true;
            }else{
                System.out.println("The number insert isn't in the range [min,max]");
            }
        }while(check);
        return num;
    }

    /**
     * Method for setting a new Locale
     * @param l Locale obj to set
     */
    public void setLocale(Locale l){
        sc.useLocale(l);
    }
}
