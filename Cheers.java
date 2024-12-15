//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String name = args[0].toUpperCase();
        int num = Integer.parseInt(args[1]);
        int lengthName = name.length();
        int i = 0;
        String lettersAn = "AEFHILMNORSX";
        while(lengthName>0)
        {
                char c = name.charAt(i);
                if(lettersAn.indexOf(c) != -1)
                {
                System.out.println("Give me an " + name.charAt(i) + ": " + name.charAt(i)+ "!");
                i++;
                lengthName--;
                }else{
                System.out.println("Give me a  " + name.charAt(i) + ": " + name.charAt(i)+ "!");
                  i++;
                lengthName--;     
                }
        }
        System.out.println("What does that spell?");
        while (num>0)
         {
                System.out.println(name + "!!!");
                num--;
        }
           }   }

