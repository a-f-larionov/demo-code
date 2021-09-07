package com.company.mapstruct.pojo;

public class SimpleDestination {

    private String name;

    private String description;

    public void setDescription(String destinationDescription) {
        description = destinationDescription;
    }

    public void setName(String destinationName) {
        name = destinationName;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
