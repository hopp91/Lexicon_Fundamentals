import java.util.Random;

public class Fundamentals {
    public void main(String[] args) {


        // Exercise 1 – Word Reverser


            String Word = IO.readln("Enter a Word:");

            StringBuilder sb = new StringBuilder(Word);

            sb.reverse();
            IO.println("After reverse: " + sb);
            IO.println("-----------------------------------------");


            // Exercise 2 – Email Slicer


            String Email = IO.readln("Enter Email:");

            int adress = Email.indexOf('@');

            String username = Email.substring(0, adress);
            String domain = Email.substring(adress + 1);

            IO.println("Username: " + username);
            IO.println("Domain: " + domain);
            IO.println("-----------------------------------------");


            // Exercise 3 – String Stats


            String scentence = IO.readln("Enter a sentence:");

            int vowels = 0;
            int consonants = 0;
            int digits = 0;
            int spaces = 0;

            for (int k = 0; k < scentence.length(); k++) {
                char ch = scentence.charAt(k);
                char lower = Character.toLowerCase(ch);

                if ("aeiou".indexOf(lower) >= 0) {
                    vowels++;
                } else if (Character.isLetter(ch)) {
                    consonants++;
                } else if (Character.isDigit(ch)) {
                    digits++;
                } else if (ch == ' ')
                    spaces++;
            }

            IO.println("Vowels: " + vowels);
            IO.println("Consonants: " + consonants);
            IO.println("Digits: " + digits);
            IO.println("Spaces: " + spaces);
            IO.println("-----------------------------------------");


            // Exercise 4 – Initials Generator


            String fullname = IO.readln("Enter full name:");

            String[] words = fullname.split("\\s+");

            IO.print("Initials: ");

            for (String word : words) {
                int initial = word.charAt(0);

                if (initial >= 97 && initial <= 122) {
                    initial = initial - 32;
                }

                IO.print((char) initial + ".");

            }

            IO.println(" ");
            IO.println("-----------------------------------------");


            // Exercise 5 – Palindrome Checker


            String word = IO.readln("Enter a word:");

            String reversed = new StringBuilder(word).reverse().toString();

            if (word.equalsIgnoreCase(reversed)) {
                IO.println(word + " is a palindrome.");
            } else {
                IO.println(word + " is NOT a palindrome.");
            }
            IO.println("-----------------------------------------");


            // Exercise 6 – Word Counter


            String sentence2 = IO.readln("Enter a sentence:");
            String find = IO.readln("Enter word to find: ");

            String[] finds = sentence2.trim().split("\\s+");
            int totalWords = sentence2.trim().isEmpty() ? 0 : finds.length;
            int count = 0;

            for (String w : words) {
                if (w.equalsIgnoreCase(find)) {
                    count++;
                }
            }

            IO.println("Total words : " + totalWords);
            IO.println("\"" + find + "\" appears: " + count + " times");
            IO.println("-----------------------------------------");


            // Exercise 7 – Circle Calculator

            String Radius = IO.readln("Enter radius: ");

            double radius = Double.parseDouble(Radius.trim());
            double area = Math.PI * radius * radius;
            double circumference = 2.0 * Math.PI * radius;

            IO.println("Area         : " + area);
            IO.println("Circumference: " + circumference);
            IO.println("-----------------------------------------");


            // Exercise 8 – Power Table

            IO.print("Enter a base number: ");

            int base = Integer.parseInt(IO.readln());

            for (int ii = 1; ii <= 10; ii++) {
                IO.println(base + " ^ " + ii + " = " + Math.pow(base, ii));
            }
            IO.println("-----------------------------------------");


            // Exercise 9 – Right Triangle Checker

            double a = Double.parseDouble(IO.readln("Enter side a: "));
            double b = Double.parseDouble(IO.readln("Enter side b: "));
            double c = Double.parseDouble(IO.readln("Enter side c: "));

            double longest = Math.max(a, Math.max(b, c));
            IO.println("Longest side: " + longest);

            double x, y;

            if (longest == a) {
                x = b;
                y = c;
            } else if (longest == b) {
                x = a;
                y = c;
            } else {
                x = a;
                y = b;
            }

            if (x * x + y * y == longest * longest) {
                IO.println("This IS a right triangle.");
            } else {
                IO.println("This is NOT a right triangle.");
            }
            IO.println("-----------------------------------------");


            // Exercise 10 – Number Cruncher


            int d = Integer.parseInt(IO.readln("Enter first number: "));
            int e = Integer.parseInt(IO.readln("Enter second number: "));
            int f = Integer.parseInt(IO.readln("Enter third number: "));

            IO.println("Maximum :  " + findMax(d, e, f));
            IO.println("Minimum : " + findMin(d, e, f));
            IO.println("Average : %.2f".formatted(average(d, e, f)));
            IO.println("-----------------------------------------");


            // Exercise 11 – Dice Statistics


            IO.print("How many rolls? ");
            int rolls = Integer.parseInt(IO.readln());

            Random random = new Random();

            int doubles = 0;

            for (int i = 1; i <= rolls; i++) {
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int total = die1 + die2;

                if (die1 == die2) {
                    IO.println("Roll " + i + ": " + die1 + " + " + die2 + " = " + total + " DOUBLE");
                    doubles++;
                } else {
                    IO.println("Roll " + i + ": " + die1 + " + " + die2 + " = " + total);
                }
            }
            IO.println("doubles rolled: " + doubles + " out of " + rolls);
            IO.println("-----------------------------------------");



            // Exercise 12 – Password Generator


            IO.print("Enter password length: ");
            int length2 = Integer.parseInt(IO.readln());

            String characters1 =
                    "abcdefghijklmnopqrstuvwxyz" +
                            "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                            "0123456789";

            StringBuilder password1 = new StringBuilder();

            for (int i = 0; i < length2; i++) {
                int index = (int) (Math.random() * characters1.length());
                password1.append(characters1.charAt(index));
            }

            IO.println("Generated password: " + password1);



            // Exercise 13 – Receipt Builder





    } // END the main methods

    static int findMax(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }

    static int findMin(int x, int y, int z) {
        return Math.min(x, Math.min(y, z));
    }

    static double average(int x, int y, int z) {
        return (x + (double) y + z) / 3;
    }



} // End Class






