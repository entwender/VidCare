package de.entwender.vidcare.core.series;

/**
 *
 * @author Marek Mayer
 */
public class Episode implements IEpisode
{

    private final ISeries _series;
    private final ISeason _season;
    private int _episodeNumber;
    private String _episodeTitle;

    public Episode(ISeries series, ISeason season)
    {
        this(series, season, 0);
    }

    public Episode(ISeries series, ISeason season, int episodeNumber)
    {
        _series = series;
        _season = season;
        _episodeNumber = episodeNumber;
    }

    /**
     * @return the _season
     */
    @Override
    public ISeason getSeason()
    {
        return _season;
    }

    /**
     * @return the _episodeNumber
     */
    @Override
    public int getEpisodeNumber()
    {
        return _episodeNumber;
    }

    /**
     * @param episodeNumber the episodeNumber to set
     */
    @Override
    public void setEpisodeNumber(int episodeNumber)
    {
        this._episodeNumber = episodeNumber;
    }

    /**
     * @return the episodeTitle
     */
    @Override
    public String getEpisodeTitle()
    {
        return _episodeTitle;
    }

    /**
     * @param episodeTitle the episodeTitle to set
     */
    @Override
    public void setEpisodeTitle(String episodeTitle)
    {
        this._episodeTitle = episodeTitle;
    }

    /**
     * @return the _series
     */
    public ISeries getSeries()
    {
        return _series;
    }
}
