package com.epsi;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by maxencegodeneche on 07/06/2014.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Item {
    @JsonProperty("kind")
    String kind;
    @JsonProperty("id")
    String id;
    @JsonProperty("volumeInfo")
    Volume volumeInfo;

    @Override
    public String toString() {
        return "Item{" +
                "kind='" + kind + '\'' +
                ", id='" + id + '\'' +
                ", volumeInfo=" + volumeInfo +
                '}';
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Volume getVolumeInfo() {
        return volumeInfo;
    }

    public void setVolumeInfo(Volume volumeInfo) {
        this.volumeInfo = volumeInfo;
    }
}
