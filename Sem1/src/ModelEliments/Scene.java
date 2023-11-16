package ModelEliments;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonModel> models;
    public List<Flash> flashes;

    public List<PoligonModel> method1(List<PoligonModel> model) {
        return this.models = model;
    }

    public List<Flash> method2(List<PoligonModel> models, List<Flash> flashe) {
        return this.flashes = flashe;
    }

    public Scene(int id) {
        this.id = id;
        this.models = new ArrayList<>();
        this.flashes = new ArrayList<>();
    }
}
