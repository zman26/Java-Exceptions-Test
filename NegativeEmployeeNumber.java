public class InvalidEmployeeNumber extends Exception
{


public InvalidEmployeeNumber()
{
super("Error: An employee number cannot be negative.");
}

public InvalidEmployeeNumber(int badNum)
{
super("Error: " + badNum + " is not a valid number");
}


}