package F3T2;

public class Rental
{
	private Movie _movie;
	private int		_daysRented;

	public Rental(Movie movie, int daysRented)
	{
		_movie = movie;
		_daysRented = daysRented;
	}

    static int getFrequentRenterPoints(Rental each, int frequentRenterPoints) {
		// add frequent renter points
		frequentRenterPoints++;

		// add bonus for a two-day new release rental
		if ((each.getMovie().getPriceCode() == Movie.Code.NEW_RELEASE) && each.getDaysRented() > 1)
			frequentRenterPoints++;
		return frequentRenterPoints;
	}

    public double getAmount() {
        double thisAmount = 0;

        // determine amounts for each line
        switch (this.getMovie().getPriceCode())
        {
            case REGULAR:
                thisAmount += 2;
                if (this.getDaysRented() > 2)
                    thisAmount += (this.getDaysRented() - 2) * 1.5;
                break;
            case NEW_RELEASE:
                thisAmount += this.getDaysRented() * 3;
                break;
            case CHILDRENS:
                thisAmount += 1.5;
                if (this.getDaysRented() > 3)
                    thisAmount += (this.getDaysRented() - 3) * 1.5;
                break;
        }
        return thisAmount;
    }

	public int getDaysRented()
	{
		return _daysRented;
	}

	public Movie getMovie()
	{
		return _movie;
	}
}
