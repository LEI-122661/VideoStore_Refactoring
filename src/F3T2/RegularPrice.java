package F3T2;

public class RegularPrice extends Price
{

	public RegularPrice()
	{
	}

	public double getRentalAmount(int duration)
	{
        if (duration > 2)
        {
            return 2 + (duration - 2) * 1.5;
        }
        else
        {
            return 2;
        }
	}

	public int getFrequentRentalPoints(int duration)
	{
		return 1;
	}
}
