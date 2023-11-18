package Fabric;

import Interface.iGameItem;
import Product.LvlUp;

public class LvlUpGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new LvlUp();
    }

}
