import java.util.*;
public class Q4{


public static void main(String[] args)
{
String s1;
String s2;
Scanner sc= new Scanner(System.in);
  
s1= sc.nextLine();
s2= sc.nextLine();

ArrayList<Character> v1 = new ArrayList<Character>();
ArrayList<Character> v2 = new ArrayList<Character>();
for (int i = 0; i < s1.length(); ++i)
{
v1.add(s1.charAt(i));
}

for (int i = 0; i < s2.length(); ++i)
{
v2.add(s2.charAt(i));
}

Collections.sort(v1);

Collections.sort(v2);
if (v1.size() != v2.size())
{
System.out.print("no");
System.out.print("\n");
}
else
{
int flag = 0;
for (int i = 0; i < v1.size(); ++i)
{
if (v1.get(i) != v2.get(i))
{
flag = 1;
break;
}

}
if (flag == 0)
{
System.out.print("Yes");
System.out.print("\n");
}
else
{
System.out.print("NO");
System.out.print("\n");
}
}
}}
