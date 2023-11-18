package Fabric;

import Interface.iGameItem;
import Product.Brilliant;

public class BrilliantGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Brilliant();
    }

}
