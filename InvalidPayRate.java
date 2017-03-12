public class InvalidPayRate extends Exception
{
public InvalidPayRate()
{
super("Error: This is not a valid pay rate.");
}

public InvalidPayRate( double pay)
{
super ("Error: "+ pay + " is not a valid pay rate.");
}

}