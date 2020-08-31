import enginee.IEngine;
import factory.ComfortCarEquipmentFactory;
import factory.EconomyCarEquipmentFactory;
import factory.ICarEquipmentFactory;
import light.ILight;
import tire.ITire;

public class AbstractFactoryExample {

    public static void main(String[] args) {

        createEquipment(new EconomyCarEquipmentFactory());
        createEquipment(new ComfortCarEquipmentFactory());
    }

    private static void createEquipment(ICarEquipmentFactory factory) {

        IEngine engine = factory.createEngine();
        engine.produceEngine();

        ILight light = factory.createLight();
        light.produceLight();

        ITire tire = factory.createTire();
        tire.produceTire();
    }
}