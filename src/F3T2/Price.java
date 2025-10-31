package F3T2;

public abstract class Price {

    boolean _blueray;

    public Price()
    {
    }

    public Price(boolean blueray)
    {
        _blueray = blueray;
    }

    public boolean is_blueray()
    {
        return _blueray;
    }

    public abstract int getFrequentRentalPoints(int duration);

    public abstract double getRentalAmount(int duration);
}
