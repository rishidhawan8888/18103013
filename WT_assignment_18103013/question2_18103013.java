import java.util.*;
public class Q2{

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); 
System.out.print("enter paragraph");
System.out.print("\n");
String s1;
String s2;
s1= sc.nextLine();
int n;
System.out.print("enter number of words");
System.out.print("\n");
n = sc.nextInt();

Set<String> s = new HashSet<String>();
ArrayList<String> v1 = new ArrayList<String>();


for(int i = 0;i<n;i++){
    s.add(sc.next());
}

String word = "";
for (int i = 0; i < s1.length(); i++)
{
if (s1.charAt(i) == ' ')
{
v1.add(word);
word = "";
}
else
{
word = word + s1.charAt(i);
}
}
if (!word.equals(" "))
{
v1.add(word);
}



for (int i = 0; i < v1.size(); ++i)
{
if (s.contains(v1.get(i)))
{
	String temp="";
	temp = temp + v1.get(i).charAt(0);
	for (int j = 1;j < v1.get(i).length();++j)
	{
	temp = temp + "*";
	}

	v1.set(i, temp);
}
if (i == v1.size() - 1)
{
System.out.print(v1.get(i));
System.out.print("\n");
}
else
{
System.out.print(v1.get(i));
System.out.print(" ");
}
}




}}