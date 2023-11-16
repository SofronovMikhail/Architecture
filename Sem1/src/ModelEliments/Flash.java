package ModelEliments;

import java.util.List;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public float power;

    public void rotate(Angle3D ang) {
        this.angle = ang;
    }

    public void move(Point3D loc) {
        this.location = loc;
    }

    public Flash(List<Scene> scene, float power) {
        this.location = new Point3D();
        this.angle = new Angle3D();
        this.color = new Color();
        this.power = power;
    }
}
