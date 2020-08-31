package factory;

import enginee.IEngine;
import light.ILight;
import tire.ITire;

public interface ICarEquipmentFactory {

    IEngine createEngine();
    ILight createLight();
    ITire createTire();
}
