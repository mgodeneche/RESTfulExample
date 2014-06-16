package com.epsi;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by maxencegodeneche on 07/06/2014.
 */
public class ISBN {
    @JsonProperty("type")
    String type;
    @JsonProperty("identifier")
    String identifier;

    @Override
    public String toString() {
        return type + " : " + identifier ;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
