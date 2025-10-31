package F3T2;

public class ChildrensPrice extends Price
{

	public ChildrensPrice()
	{
	}


	public double getRentalAmount(int duration)
	{
        if (duration > 3)
        {
            return 1.5 + (duration - 3) * 1.5;
        }
        else
        {
            return 1.5;
        }
	}

	public int getFrequentRentalPoints(int duration)
	{
		return 1;
	}

}
