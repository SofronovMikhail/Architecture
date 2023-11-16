package ModelEliments;

import java.util.ArrayList;
import java.util.List;

public class PoligonModel {
    public List<Texture> textures;
    public List<Poligon> poligons;

    public PoligonModel(List<Texture> arr, List<Scene> scene) {
        this.textures = arr;
        this.poligons = new ArrayList<>();
        poligons.add(new Poligon());
        scene.add(new Scene(0));
    }
}
