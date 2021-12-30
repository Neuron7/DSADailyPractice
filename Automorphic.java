class Demofunction
{
public static String auto(int n)
{
String msg="";
int s=0;
int r=n%10;
s=r*r;
if(s==n)
{
msg="Num is Automorphic";
}
else
{
msg="Num is not Automorphic";
}
return(msg);
}
public static void main(String ab[])
{
int x;
String r;
x=Integer.parseInt(ab[0]);
r=auto(x);
System.out.println(r);
}
}