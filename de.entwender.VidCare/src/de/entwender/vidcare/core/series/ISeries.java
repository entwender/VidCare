package de.entwender.vidcare.core.series;

/**
 *
 * @author Marek Mayer
 */
public interface ISeries {

    /**
     * @return the _id
     */
    long getId();

    /**
     * @return the _name
     */
    String getName();

    /**
     * @param _id the _id to set
     */
    void setId(long _id);

    /**
     * @param _name the _name to set
     */
    void setName(String _name);

}
