/*
 *
 */

package me.melvins.learning.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @author Mels
 */
public class V2ResponseVO {

    @JsonProperty(value = "String", index = 1)
    private Integer string;

    @JsonProperty(value = "Now", index = 2)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    /**
     * Default Constructor
     */
    public V2ResponseVO(Integer string) {
        this.string = string;
        date = new Date();
    }

    /**
     * Getter for {@code string}.
     *
     * @return
     */
    public Integer getString() {
        return string;
    }

    /**
     * Setter for {@code string}.
     *
     * @param string
     */
    public void setString(Integer string) {
        this.string = string;
    }

    /**
     * Getter for {@code date}.
     *
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter for {@code date}.
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

}
