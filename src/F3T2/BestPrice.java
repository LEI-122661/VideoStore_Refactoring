package F3T2;

public class BestPrice extends Price
{
	public BestPrice()
	{
	}
	
	public BestPrice(boolean blueray)
	{
		super(blueray);
	}

	public double getRentalAmount(int duration)
	{
		return duration + (is_blueray() ? 1 : 0);
	}

	public int getFrequentRentalPoints(int duration)
	{
		return is_blueray() ? 1 : 0;
	}

}
