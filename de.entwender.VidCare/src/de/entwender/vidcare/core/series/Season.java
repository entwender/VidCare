package de.entwender.vidcare.core.series;

/**
 *
 * @author entwender
 */
public class Season implements ISeason
{
    private final int _seasonNumber;

    public Season(int seasonNumber)
    {
        _seasonNumber = seasonNumber;
    }

    /**
     * @return the _seasonNumber
     */
    @Override
    public int getSeasonNumber()
    {
        return _seasonNumber;
    }
}
