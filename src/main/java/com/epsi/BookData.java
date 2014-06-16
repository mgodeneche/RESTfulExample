package com.epsi;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by maxencegodeneche on 07/06/2014.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class BookData {
    @JsonProperty("kind")
    String kind;
    @JsonProperty("totalItems")
    Integer totalItems;
    @JsonProperty("items")
    List<Item> items;

    @Override
    public String toString() {
        return "BookData{" +
                "kind='" + kind + '\'' +
                ", totalItems=" + totalItems +
                ", items=" + items +
                '}';
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
