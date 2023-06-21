
public class Armstrong
{
public static void main(String args[])
{
scanner rev = new scanner(system.in);
System.out.println("ENTER A NUMBER");
int num = rev.nextInt();
int arm=0,num=0;
for(num=1;num<=200;num++)
{
int temp=num;
while(num>0){
rev=num%10;
num=num/10;
arm=(rev*rev*rev)+arm;
}
if(temp==arm)

System.out.println("number is armstrong "+num);
else

System.out.println("number is not armstrong "+num);
}}}