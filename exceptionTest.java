import java.util.Scanner;
public class exceptionTest
{

public static void main (String[] args) 
{

Scanner keyboard = new Scanner (System.in);
ProductionWorkerWX p1 = new ProductionWorkerWX ();
int shift = 0;
try
{

System.out.print("Please enter a shift (1 for day and 2 for night): ");

shift = keyboard.nextInt();
p1.setShift(shift);



System.out.print("Please enter hourly pay rate: ");
double rate = keyboard.nextDouble();

p1.setHourlyPayRate(rate);

System.out.print("Please enter Employee ID: ");
int num = keyboard.nextInt();

p1.setNumber(num);


}
catch(InvalidShift e)
{System.out.print(e.getMessage());}

catch (InvalidPayRate e)
{System.out.print(e.getMessage());}

catch(InvalidEmployeeNumber e)
{System.out.print(e.getMessage());}

catch (Exception e)
{System.out.print(e.getMessage());}


System.out.println ("\nFINISHED!");
}

}