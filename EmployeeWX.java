public class EmployeeWX
{
private String Name;
private String HireDate;
private int Number;

public EmployeeWX()
{
Name = "";
Number = 0;
HireDate = "";
}
public EmployeeWX(String Name, int Number, String HireDate)
      throws InvalidEmployeeNumber
{
this.Name = Name;
this.HireDate = HireDate;

if (Number < 1111 || Number > 9999)
   throw new InvalidEmployeeNumber(Number);
this.Number = Number;
}
//set
public void setName (String Name)
{this.Name = Name;}

public void setNumber (int Number)
      throws InvalidEmployeeNumber
{
if (Number < 1111 || Number > 9999)
   throw new InvalidEmployeeNumber(Number);
this.Number = Number;}

public void setHireDate (String HireDate)
{this.HireDate = HireDate;}

//get

public String getName()
{return Name;}

public int getNumber()
{return Number;}

public String getHireDate()
{return HireDate;}

public String toString()
{
String str = "Name is "+Name+", the Employee Number is " +Number+", and the employee was hired on " +HireDate;
return str;
}


}