package de.entwender.vidcare.core.movies;

/**
 *
 * @author Marek Mayer
 */
public interface IMovie {

    /**
     * @return the _title
     */
    String getTitle();

    /**
     * @return the _year
     */
    int getYear();

    /**
     * @param _title the _title to set
     */
    void setTitle(String _title);

    /**
     * @param _year the _year to set
     */
    void setYear(int _year);

}
