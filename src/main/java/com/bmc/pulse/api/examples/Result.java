package com.bmc.pulse.api.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "aggregates"
})
public class Result {

    @JsonProperty("aggregates")
    private List<List<List<Integer>>> aggregates = new ArrayList<List<List<Integer>>>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The aggregates
     */
    @JsonProperty("aggregates")
    public List<List<List<Integer>>> getAggregates() {
        return aggregates;
    }

    /**
     * 
     * @param aggregates
     *     The aggregates
     */
    @JsonProperty("aggregates")
    public void setAggregates(List<List<List<Integer>>> aggregates) {
        this.aggregates = aggregates;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
