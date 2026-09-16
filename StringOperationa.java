import java.util.Scanner;
class StringOperations{
public static void main(String[]args)
{
Scanner sc = new
Scanner(System.in);
System.out.print("enter first string:");
string str1 = sc.nextLine();

//charAt()
System.out.print("enter second string:");
String str2 = sc.nextLine();

//charAt()
System.out.print1n("\nCharacter at index0:"+str1.charAt(0));
System.out.print1n("Substring from index 1:"+str1.substring(1));
System.out.print1n("Concatenation:"+str1.concat(str2));
System.out.print1n("Are both strings equal?"+str1.equals(str2));
System.out.print1n("Is first string empty?"+str1.is empty());
sc.close();
}
}