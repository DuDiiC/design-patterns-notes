package factory;

import enginee.IEngine;
import enginee.PetrolEngine;
import light.Halogen;
import light.ILight;
import tire.BudgetTire;
import tire.ITire;

public class EconomyCarEquipmentFactory implements ICarEquipmentFactory {

    @Override
    public IEngine createEngine() {
        return new PetrolEngine();
    }

    @Override
    public ILight createLight() {
        return new Halogen();
    }

    @Override
    public ITire createTire() {
        return new BudgetTire();
    }
}
