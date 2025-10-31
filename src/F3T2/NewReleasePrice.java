package F3T2;

public class NewReleasePrice extends Price
{

	public NewReleasePrice()
	{
	}

	public double getRentalAmount(int duration)
	{
		return duration * 3;
	}

	public int getFrequentRentalPoints(int duration)
	{
        if (duration > 1)
        {
            return 2;
        }
        else
        {
            return 1;
        }
	}

}
