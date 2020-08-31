package factory;

import enginee.HybridEngine;
import enginee.IEngine;
import light.ILight;
import light.LedLight;
import tire.ITire;
import tire.PremiumTire;

public class ComfortCarEquipmentFactory implements ICarEquipmentFactory {

    @Override
    public IEngine createEngine() {
        return new HybridEngine();
    }

    @Override
    public ILight createLight() {
        return new LedLight();
    }

    @Override
    public ITire createTire() {
        return new PremiumTire();
    }
}
