public class InvalidEmployeeNumber extends Exception
{


public InvalidEmployeeNumber()
{
super("Error: This Employee Number is not valid.");
}

public InvalidEmployeeNumber(int badNum)
{
super("Error: " + badNum + " is not a valid employee ID number.");
}


}