//import java.nio.file.Path;
import java.io.IOException;
import  java.util.*;
import java.io.File;
//import java.io.FileNotFoundException;

public class JavaLearning {
    public static void main(String[] args){
        //table();
        //calc();
        //checkOrder();
        //smallestNumber();
        //switchCase();
        //findDayOfWeek();
        //findWorkDay();
        //whileLoop();
        //forLoop();
        //doWhileLoop();
        //quizLoop();
        //readFile();

        //int[] numbers = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
        //fizzBuzz(numbers);

        /*int[] votes = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
        int userWithMostVotes = mostVotes(votes);
        System.out.println("User with the most votes is User: " + userWithMostVotes);*/

        //assignment();
        //fun1();
        //System.out.print("A");

        //List<Scientist> team = new ArrayList<>();
        //team.add(new Godel());
        //team.add(new Tesla());

        //System.out.println("Scientist list");
        //for(Scientist scientist : team){
        //    scientist.printTheory();
        //}

        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        moveZerosToEnd(arr);
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");


        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        iterate(intList);
        */
        List<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);

        ListIterator<Integer> listIterator = arrayList.listIterator();
        while(listIterator.hasNext()) {
            System.out.print(listIterator.next());
            listIterator.previous();
        }
    }

    public static void iterate (List<Integer> numberList) {
        ListIterator<Integer> it = numberList.listIterator(1);
        it.next();
        it.next();
        it.previous();
        System.out.println(it.next());
    }


    public static void moveZerosToEnd(int arr[])
    {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];
        while (count < n)
            arr[count++] = 0;
    }
    public static void printArray(ArrayList<Float> arr) {   //Change the type of the parameter to ArrayList
        for(Object a : arr) {              //Change the data type of 'a' from 'int' to 'Object'
            float x = (float)a;
            System.out.println(x);
        }
    }

    static void fun() {
        throw new ArithmeticException();
    }
    static void fun1() {
        try {
            fun2();
            System.out.print("B");
        } catch (Exception e) {
            System.out.print("C");
        }
    }

    static void fun2() throws IOException {
        fun3();
        System.out.print("D");
    }
    static void fun3() throws IOException {
        throw new IOException();
    }
    public static void assignment(){
        String[] elements = { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl",
                "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr",
                "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs",
                "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W",
                "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np",
                "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg",
                "Cn", "Uut", "Uuq", "Uup", "Uuh", "Uus", "Uuo" };

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inputWord = myScanner.next();
        String chemWord = spellWord(inputWord, elements);

        System.out.println(chemWord);

        myScanner.close();
    }
    public static String spellWord(String word, String[] elements) {
        String punctuatedWord = "";
        int index;
        int i = 0;

        while (i < word.length()) {
            if (((i + 2) < word.length()) && (index = searchInElementSymbol(word.substring(i, i + 3), elements)) != -1) {
                punctuatedWord = punctuatedWord.concat(elements[index]);
                i = i + 3;
            }
            else if ((((i + 1) < word.length()) && (index = searchInElementSymbol(word.substring(i, i + 2), elements)) != -1)){
                punctuatedWord = punctuatedWord.concat(elements[index]);
                i = i + 2;
            }
            else if ((((i) < word.length()) && (index = searchInElementSymbol(word.substring(i, i+1), elements)) != -1)){
                punctuatedWord = punctuatedWord.concat(elements[index]);
                i = i + 1;
            }
            else {
                System.out.println("cannot spell word");
                break;
            }
        }
        if(i==word.length()) {
            System.out.println(punctuatedWord);
        }
        return punctuatedWord;
    }
    private static int searchInElementSymbol(String element, String[] elements) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equalsIgnoreCase(element)) {
                return i;
            }
        }
        return -1;
    }
    public static Integer mostVotes(int[] votes){
        int max = 0;
        int ind = 0;
        for(int i=0;i<votes.length;i++){
            if(votes[i]>max){
                max = votes[i];
            }
        }
        for(int i=0;i<votes.length;i++){
            if(votes[i]==max){
                ind = i;
            }
        }
        return ind;
    }
    public static void fizzBuzz(int[] numbers){
        for(int i=0;i<numbers.length; i++){
            if((numbers[i]%3==0) && (numbers[i]%5==0)) {
                System.out.print(" FizzBuzz");
            }else if(numbers[i]%5==0){
                System.out.print(" Buzz");
            }else if(numbers[i]%3==0){
                System.out.print(" Fizz");
            }else{
                System.out.print(" " + numbers[i]);
            }
        }
    }
    public static void readFile(){

        try{
            File inputFile = new File("/Users/User/JavaProjects/numbers.txt");
            Scanner scan = new Scanner(inputFile);
            int sum = 0;
            int nCount = 0;
            while(scan.hasNext()){
                sum += scan.nextInt();
                nCount++;
            }
            System.out.println(sum/nCount);
        }catch(Exception ex){
            System.out.println("Error Occured: " + ex.getMessage());
        }




    }
    public static String prime(int num) {
        boolean primecheck = true;
        String result;
        for (int i = 2; i <= Math.round(num); i++) {
            // condition for nonprime number
            if (num % i == 0) {

                primecheck = false;
                break;
            }
        }

        if (primecheck == true) {
            result = "Prime";
        } else {
            result = "Not a prime";
        }
        return result;
    }
    public static double test(double n1, double n2) {
        double res = Math.pow((n1+n2),2);
        return res;
    }
    static void quizLoop(){
        int nMin = 100000;
        int[] array = {156, 171, 260, 95, 244, 296, 137, 180, 198, 61, 70, 283, 276, 55,
                + 100, 59, 278, 191, 109, 110, 158, 206, 77, 279, 53, 117, 217, 214, 107, 99, 222,
                + 275, 179, 213, 199, 139, 174, 286, 176, 155, 237, 256, 251, 187, 249, 215, 211, 113,
                + 144, 50, 148, 49, 170, 236, 219, 106, 71, 263, 145, 231, 190, 165, 239, 41, 177, 297,
                + 184, 193, 287, 202, 161, 189, 79, 232, 154, 153, 208, 72, 143, 300, 233, 124, 75,
                + 277, 63, 130, 86, 242, 203, 116, 196, 289, 146, 273, 268, 56, 104, 173, 134, 194};

        for (int i = 0;i<array.length;i++){
            if(nMin>array[i]){
                nMin = array[i];
                System.out.println(nMin);
            }
        }
        System.out.println("Minimum value: " + nMin);
    }
    static void doWhileLoop(){
        int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        int nCount = 0;
        while(n != 0){
            n/=10;
            nCount ++;
        }
        System.out.println(nCount);

    }
    static void forLoop(){
        int n=2;
        for (int i=12-n; i>2;i=i-n){
            System.out.println(i);
        }
    }
    static void whileLoop(){
        int nChar = 97;
        while(nChar<=122){
            System.out.print((char)nChar);
            nChar = nChar + 1;
        }

    }
    static void findWorkDay(){
        Scanner scan = new Scanner(System.in);
        // Enter month
        String sMonth = scan.next();
        // Enter date
        int nDayNumber = scan.nextInt();

        int nDay = 0;
        if(sMonth.equals("January")){
            nDayNumber = nDay;
        }else if(sMonth.equals("February")){
            nDayNumber = 31 + 28 + nDay;
        }else if(sMonth.equals("March")){
            nDayNumber = 31 + 28 + 31 + nDay;
        }else if(sMonth.equals("April")){
            nDayNumber = 31 + 28 + 31 + 30 + nDay;
        }else if(sMonth.equals("May")){
            nDayNumber = 31 + 28 + 31 + 30 + 31 + nDay;
        }else if(sMonth.equals("June")){
            nDayNumber = 31 + 28 + 31 + 30 + 31 + 30 + nDay;
        }else if(sMonth.equals("July")){
            nDayNumber = 31 + 28 + 31 + 30 + 31 + 30 +31 + nDay;
        }else if(sMonth.equals("August")){
            nDayNumber = 31 + 28 + 31 + 30 + 31 + 30 +31 + 31 + nDay;
        }else if(sMonth.equals("September")){
            nDayNumber = 31 + 28 + 31 + 30 + 31 + 30 +31 + 31 + 30 + nDay;
        }else if(sMonth.equals("October")){
            nDayNumber = 31 + 28 + 31 + 30 + 31 + 30 +31 + 31 + 30 + 31 + nDay;
        }else if(sMonth.equals("November")){
            nDayNumber = 31 + 28 + 31 + 30 + 31 + 30 +31 + 31 + 30 + 31 + 30 + nDay;
        }else{
            nDayNumber = 31 + 28 + 31 + 30 + 31 + 30 +31 + 31 + 30 + 31 + 30 + 31 + nDay;
        }

        // From the day number of the year, finding the day no. of the week
        int nDayRes = nDayNumber % 7;

        if (nDayRes==6 || nDayRes==7 ) {
            System.out.print("Hurray!");
        } else {
            System.out.print("Ohhh! It's a work day :|");
        }

        scan.close();
    }
    static void findDayOfWeek(){
        Scanner in = new Scanner(System.in);
        int nDay = in.nextInt();
        int nDayRes = nDay%7;
        String sResult = "";
        int nDayNumber;
        String sMonth = in.nextLine();
        if(sMonth.equals("January")){
            nDayNumber = nDay;
        }else if(sMonth.equals("February")){
            nDayNumber = 28 + nDay;
        }else if(sMonth.equals("March")){
            nDayNumber = 28 + 31 + nDay;
        }else if(sMonth.equals("April")){
            nDayNumber = 28 + 31 + 30 + nDay;
        }else if(sMonth.equals("May")){
            nDayNumber = 28 + 31 + 30 + 31 + nDay;
        }else if(sMonth.equals("June")){
            nDayNumber = 28 + 31 + 30 + 31 + 30 + nDay;
        }else if(sMonth.equals("July")){
            nDayNumber = 28 + 31 + 30 + 31 + 30 +31 + nDay;
        }else if(sMonth.equals("August")){
            nDayNumber = 28 + 31 + 30 + 31 + 30 +31 + 31 + nDay;
        }else if(sMonth.equals("September")){
            nDayNumber = 28 + 31 + 30 + 31 + 30 +31 + 31 + 30 + nDay;
        }else if(sMonth.equals("October")){
            nDayNumber = 28 + 31 + 30 + 31 + 30 +31 + 31 + 30 + 31 + nDay;
        }else if(sMonth.equals("November")){
            nDayNumber = 28 + 31 + 30 + 31 + 30 +31 + 31 + 30 + 31 + 30 + nDay;
        }else{
            nDayNumber = 28 + 31 + 30 + 31 + 30 +31 + 31 + 30 + 31 + 30 + 31 + nDay;
        }



        switch(nDayRes){
            case 1:
                sResult = "Monday";
                break;
            case 2:
                sResult = "Tuesday";
                break;
            case 3:
                sResult = "Wednesday";
                break;
            case 4:
                sResult = "Thursday";
                break;
            case 5:
                sResult = "Friday";
                break;
            case 6:
                sResult = "Saturday";
                break;
            case 7:
                sResult = "Sunday";
                break;
            default:
                sResult = "Invalid selection";
                break;
        }

        System.out.println(sResult);

    }
    static void switchCase(){

        Scanner in = new Scanner(System.in);
        int nSelection = in.nextInt();
        String sRes = "Preparing ";

        switch(nSelection){
            case 1:
                sRes += "Cappuccino";
                break;
            case 2:
                sRes += "Espresso";
                break;
            case 3:
                sRes += "Latte";
                break;
            case 4:
                sRes += "Milk";
            default:
                sRes = "Please select from 1 to 4";
        }
        System.out.println(sRes);
    }
    static void smallestNumber(){
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        if(n1<n2 && n1<n3){
            System.out.println("The smallest number entered is " + n1);
        }else if(n2<n3 && n2<n1){
            System.out.println("The smallest number entered is " + n2);
        }else {
            System.out.println("The smallest number entered is " + n3);
        }
    }
    static void checkOrder() {
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        if(n1<n2 && n2<n3){
            System.out.println("The numbers entered are in increasing order");
        }else if(n3<n2 && n2<n1){
            System.out.println("The numbers entered are in decreasing order");
        }else{
            System.out.println("The number are neither in increasing order nor in decreasing order");
        }
    }
    static void GetTensHundreds(){
        //Create new scanner

        Scanner input = new Scanner(System.in);

        //Values of each digit
        int tenThousands, thousands, hundreds, tens, ones;

        //Prompt user to input 5 digit number

        int number = input.nextInt();
        if (number > 99999) {
            System.out.println("\nError! Number more than 5 digits.");
        }
        else if (number < 10000) {
            System.out.println("Error! Number less than 5 digits.");
        }
        else if (10000<=number&&number<=99999){
            tenThousands = number/10000;
            System.out.println(tenThousands);
            thousands = (number/1000)%10;
            System.out.println(thousands);
            hundreds = (number%1000)/100;
            System.out.println(hundreds);
            tens = (number%100)/10;
            System.out.println(tens);
            ones = number%10;
            System.out.println(ones);
        }
    }
    static void calc(){
        int a = 5; int b = 4; int c = 3;
        int z = a + b - c * a;
        System.out.println(z);
    }
    static void table(){
        for(int x = 1;x<=10;x++){
            System.out.println("Table of " + x);
            System.out.println("--------------");
            for (int i=1;i<=10;i++){
                System.out.println(x + " x " + i + " = " + x * i);
            }
            System.out.println("-------------");
        }
    }
}

class Scientist {
    private String theory = ("Science");
    public void printTheory() {
        System.out.println(theory);
    }
}
class Godel extends Scientist {
    private String theory = ("Mathematics");
    public void printTheory() {
        System.out.println(theory);
    }
}

class Tesla extends Scientist {
    private String theory = ("Physics");
    public void printTheory() {
        System.out.println(theory);
    }
}