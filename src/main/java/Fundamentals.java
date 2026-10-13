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

        for (int i = 0; i < scentence.length(); i++) {
            char ch = scentence.charAt(i);
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




    }
}






