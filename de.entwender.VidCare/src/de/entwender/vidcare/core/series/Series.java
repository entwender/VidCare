package de.entwender.vidcare.core.series;

/**
 *
 * @author entwender
 */
public class Series implements ISeries
{
    private String _name = "";
    private long _id = 0;

    public Series()
    {
    }

    public Series(String name, long id)
    {
        _name = name;
        _id = id;
    }

    /**
     * @return the _name
     */
    @Override
    public String getName()
    {
        return _name;
    }

    /**
     * @param _name the _name to set
     */
    @Override
    public void setName(String _name)
    {
        this._name = _name;
    }

    /**
     * @return the _id
     */
    @Override
    public long getId()
    {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    @Override
    public void setId(long _id)
    {
        this._id = _id;
    }

}
