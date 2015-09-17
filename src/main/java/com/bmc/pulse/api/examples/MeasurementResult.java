// Copyright 2014-2015 Boundary, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.bmc.pulse.api.examples;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Top level class of Notification JSON to Java Objects
 */
public class MeasurementResult implements Serializable {

    private static final long serialVersionUID = 141334700285462329L;

    @JsonProperty
    private Map<String, Aggregates> result;


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        return builder.toString();
    }

    public static MeasurementResult load(String resource) throws URISyntaxException {
        Measurements instance = new AlarmNotification();

        ClassLoader classLoader = instance.getClass().getClassLoader();
        URL url = classLoader.getResource(resource);
        File file = new File(url.toURI());

        ObjectMapper mapper = new ObjectMapper();

        try {
            instance = mapper.readValue(file, Measurements.class);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return instance;
    }
}

