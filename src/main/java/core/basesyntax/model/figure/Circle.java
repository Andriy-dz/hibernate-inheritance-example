package core.basesyntax.model.figure;

import javax.persistence.Entity;

@Entity(name = "circles")
public class Circle extends Figure {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
