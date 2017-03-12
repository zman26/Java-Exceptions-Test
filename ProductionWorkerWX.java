public class ProductionWorkerWX extends EmployeeWX
{
private int Shift;
private double HourlyPayRate;

public ProductionWorkerWX()
{
Shift = 0;
HourlyPayRate = 0.0;
}

public ProductionWorkerWX (int Shift, double HourlyPayRate,String name,String hireDate, int number)
      throws InvalidShift, InvalidPayRate, InvalidEmployeeNumber
{
super(name,number, hireDate);

if (Shift !=1 && Shift != 2)
   throw new InvalidShift(Shift);
   
   
if (HourlyPayRate < 0)
   throw new InvalidPayRate(HourlyPayRate);

this.Shift = Shift;
this.HourlyPayRate = HourlyPayRate;
}

//set

public void setShift(int Shift)
      throws InvalidShift
{
if (Shift !=1 && Shift != 2)
   throw new InvalidShift(Shift);
   
this.Shift = Shift;}

public void setHourlyPayRate(double HourlyPayRate)
      throws InvalidPayRate
{
if (HourlyPayRate < 0)
   throw new InvalidPayRate(HourlyPayRate);
   
this.HourlyPayRate = HourlyPayRate;}

//get
public int getShift()
{return Shift;}

public double getHourlyPayRate()
{return HourlyPayRate;}


//toString

public String toString()
{
String str = "Name is "+ getName() +". The Employee Number is " + getNumber() +".\n The employee was hired on " + getHireDate()+ " and works the " +Shift+ " (1 for day and 2 for night) shift at a hourly rate of $" + HourlyPayRate+".";
return str;
}


}