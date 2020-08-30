## Idea

Oddziela tworzenie złożonego obiektu od jego reprezentacji, dzięki czemu ten sam proces konstrukcji może doprowadzić do powstania różnych reprezentacji.

## Kiedy używać

Najczęściej używany, gdy trzeba zbudować **złożony obiekt** (tzw. *kompozyt*).

> UWAGA: Często może to oznaczać tworzenie *super klasy*, która jest odpowiedzialna za zbyt wiele rzeczy. Łamie to wprost pierwszą z zasad SOLID, więc należy się upewnić, czy nie ma możliwości uproszczenia modelu. Dopiero jeśli okaże się to niemożliwe bądź niepraktyczne, należy rozważyć zastosowanie budowniczego.

Budowniczy jest stosowany, gdy:

- tworzony jest złożony obiekt, którego nie da się (lub nie powinno się) uprościć
- nie da się stworzyć instancji obiektu przy pomocy jednorazowe operacji (mamy doczynienia z wieloetapową inicjalizacją)
- tworzony obiekt będzie budowany wiele razy na różne sposoby

## Struktura [GoF]

![builder - struktura](builder_struktura.png)

## Elementy

- `Builder` - określa abstrakcyjny interfejs do tworzenia składników obiektu `Product`
- `ConcreteBuilder` - dostarcza konretnych implementacji metodą interfejsu `Builder`
- `Director` - tworzy obiekt za pomocą interfejsu klasy `Builder`
- `Product` - reprezentuje generowany przez budowniczego obiekt złożony

## Korzyści ze stosowania

- logika odpowiadająca za to jak obiekt ma być zbudowany będzie oddzielona od implementacji
- spełnia *open/close principle* - łatwo dodać do kodu nowych `ConcreteBuilder` bez modyfikacji instniejących
- spełnia *dependency inversion principle*
- sprzyja "samodokumentującemu" się kodowi - użycie popularnego wzorca sprawia, że intuicyjnie wiemy za co odpowiadają poszczególne klasy wchodzące w jego skład
- daje dużą kontrolę nad etapami budowania kompozytu

## Konsekwencje [GoF]

### *Możliwość modyfikowania wewnętrznej reprezentacji obiektu*

Obiekt `Builder` udostępnia obiektowi `Director` interfejs abstrakctjny do tworzenia produktu. Umożliwia on `Builder`owi ukrycie reprezentacji, wewnętrznej struktury i sposobu składowania produktu. Skoro do tworzenia produktu służy abstrakcyjny interfejs, zmiana wewnętrznej reprezentacji wymaga jedynie zdefiniowania nowego obiektu `Builder`.

### *Odizolowanie reprezentacji od kodu służącego do tworzenia produktu*

Budowniczy pomaga zwiększyć modularność, ponieważ enkapsuuje proces tworzenia i reprezentowania obiektu złożonego. Klient nie potrzebuje żadnych informacji o klasach definiujących wewnętrzną strukturę produktu, ponieważ te klasy nie występują w interfejsie obiektu `Builder`.

Każdy `ConcreteBuilder` obejmuje cały kod potrzebny do tworzenia i składania produktów określonego rodzaju. Taki kod wystarczy napisać raz, a następnie wielokrotnie go wykorzystywać w obiektach `Director` do tworzenia wielu odmian obiektu `Product` za pomocą tych samych składników.

### *Większa kontrola nad procesem tworzenia*

Budowniczy polega na geneowaniu produktów krok po kroku, pod kontrolą obiektu `Director`. Dopiero po ukończeniu produktu `Director` odbiera go od obiektu `Builder`. Z tego powodu interfejs klasy `Builder` w większym stopniu niż inne wzorce konstrukcyjne odzwierciedla proces tworzenia produktów. Zapewnia to pełniejszą kontrolę nad samym procesem, a także i wewnętrzną strukturą gotowego produktu.

## Przykład użycia

```java
// Product - klasa, którą chcemy zbudować
public class House {

    int floors;
    int walls;
    boolean garage;

    // setters, getters, toString
}

// Director - logika inicjalizacji obiektu
public class HouseDirector {

    public void constructHouse(IHouseBuilder builder) {
        // tutaj zwykle rozbudowana logika
        builder.buildFloors();
        builder.buildWalls();
        builder.buildGarage();
    }
}

// Builder - interfejs budowniczego
public interface IHouseBuilder {
    void buildFloors();
    void buildWalls();
    void buildGarage();
    House getResult();
}

// ConcreteBuilder - konkretna implementacja
public class SmallHouseBuilder implements IHouseBuilder {

    private House house = new House();

    public void buildFloors() {
        house.setFloors(1);
    }

    public void buildWalls() {
        house.setWalls(4);
    }

    public void buildGarage() {
        house.setGarage(false);
    }

    public House getResult() {
        return house;
    }
}

// ConcreteBuilder - konkretna implementacja
public class LargeHouseBuilder implements IHouseBuilder {

    private House house = new House();

    public void buildFloors() {
        house.setFloors(3);
    }

    public void buildWalls() {
        house.setWalls(10);
    }

    public void buildGarage() {
        house.setGarage(true);
    }

    public House getResult() {
        return house;
    }
}

public class BuilderExample {

    public static void main(String[] args) {

        HouseDirector houseDirector = new HouseDirector();
        IHouseBuilder smallHouseBulder = new SmallHouseBuilder();
        IHouseBuilder largeHouseBuilder = new LargeHouseBuilder();

        houseDirector.constructHouse(smallHouseBuilder);
        houseDirector.constructHouse(largeHouseBuilder);

        House smallHouse = smallHouseBuilder.getResult();
        House largeHouse = largeHouseBuilder.getResult();
    }
}
```