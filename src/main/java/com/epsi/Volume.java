package com.epsi;

/**
 * Created by maxence godeneche on 07/06/2014.
 */

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Volume {
    @JsonProperty("title")
    String title;
    @JsonProperty("pageCount")
    Integer pageCount;
    @JsonProperty("authors")
    List<String> authors;

    @JsonProperty("industryIdentifiers")
    //IndustryIdentifiers industryIdentifiers;
    List<ISBN> ISBNINFOS;

    public List<ISBN> getISBNINFOS() {
        return ISBNINFOS;
    }

    public void setISBNINFOS(List<ISBN> ISBNINFOS) {
        this.ISBNINFOS = ISBNINFOS;
    }

    //   public IndustryIdentifiers getIndustryIdentifiers() {
//        return industryIdentifiers;
//    }
//
//    public void setIndustryIdentifiers(IndustryIdentifiers industryIdentifiers) {
//        this.industryIdentifiers = industryIdentifiers;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }


}
