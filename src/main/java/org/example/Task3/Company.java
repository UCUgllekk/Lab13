package org.example.Task3;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Company {
    private String name;
    private String description;
    private String logoUrl;

    public String toString() {
        return "Company{"
                + "name='"
                + getName() + '\''
                + ", description='"
                + getDescription() + '\''
                + ", logoUrl='"
                + getLogoUrl() + '\''
                + '}';
    }
}


