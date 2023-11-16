package ModelEliments;

import java.util.List;

public class Camera {
    public Point3D location;
    public Angle3D angle;

    public void rotate(Angle3D ang) {
        this.angle = ang;
    }

    public void move(Point3D loc) {
        this.location = loc;
    }

    public Camera(List<Scene> scene) {
        this.location = new Point3D();
        this.angle = new Angle3D();
        scene.add(new Scene(0));
    }
}
