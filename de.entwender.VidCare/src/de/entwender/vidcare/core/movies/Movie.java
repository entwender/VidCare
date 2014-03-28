package de.entwender.vidcare.core.movies;

/**
 *
 * @author Marek Mayer
 */
public class Movie implements IMovie
{
    private String _title;
    private int _year;

    /**
     * @return the _title
     */
    @Override
    public String getTitle()
    {
        return _title;
    }

    /**
     * @param _title the _title to set
     */
    @Override
    public void setTitle(String _title)
    {
        this._title = _title;
    }

    /**
     * @return the _year
     */
    @Override
    public int getYear()
    {
        return _year;
    }

    /**
     * @param _year the _year to set
     */
    @Override
    public void setYear(int _year)
    {
        this._year = _year;
    }
}
