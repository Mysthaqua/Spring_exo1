package tibo.spring.exo.exo1.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TODO {
    private String name;
    private String description;
    private boolean isDone;

    public TODO(String name, String description) {
        this.name = name;
        this.description = description;
        this.isDone = false;
    }
}
