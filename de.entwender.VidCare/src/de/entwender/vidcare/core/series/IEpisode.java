package de.entwender.vidcare.core.series;

/**
 *
 * @author entwender
 */
public interface IEpisode {

    /**
     * @return the _episodeNumber
     */
    int getEpisodeNumber();

    /**
     * @return the _episodeTitle
     */
    String getEpisodeTitle();

    /**
     * @return the _season
     */
    ISeason getSeason();

    /**
     * @param episodeNumber the episodeNumber to set
     */
    void setEpisodeNumber(int episodeNumber);

    /**
     * @param episodeTitle the _episodeTitle to set
     */
    void setEpisodeTitle(String episodeTitle);

}
