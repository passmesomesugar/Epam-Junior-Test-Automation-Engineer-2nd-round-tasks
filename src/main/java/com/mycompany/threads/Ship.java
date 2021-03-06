package com.mycompany.threads;

import com.mycompany.threads.ShipSizes.Size;

import java.util.UUID;

public class Ship {
    private static int shipCount;
    Size size;
    int containerLoadCapacity;
    int containersOnShip;
    String id;
    boolean shipUnloaded;
    boolean shipLoaded;

    public Ship(Size size, int containersOnShip, boolean shipUnloaded, boolean shipLoaded) {
        containerLoadCapacity = size.getLoadCapacity();
        this.containersOnShip = containersOnShip;
        setShipUnloadedBoolean(shipUnloaded);
        setShipLoadedBoolean(shipLoaded);
        id = UUID.randomUUID().toString();
        shipCount++;
    }

    public Ship(Size size, int containersOnShip) {
        containerLoadCapacity = size.getLoadCapacity();
        this.containersOnShip = containersOnShip;
        id = UUID.randomUUID().toString();
        shipCount++;
    }

    public int getShipCount() {
        return shipCount;
    }

    public boolean checkShipAvailableSpace() {
        if (containersOnShip > containerLoadCapacity) {
            return false;
        }
        return true;
    }

    public synchronized void loadShip(int containers) {
        this.containersOnShip += containers;
    }

    public synchronized void unloadShip(int containers) {
        this.containersOnShip -= containers;
    }

    public int getContainersOnShip() {
        return containersOnShip;
    }

    public int getContainerLoadCapacity() {
        return containerLoadCapacity;
    }

    public String getId() {
        return this.id;
    }

    public Size getSize() {
        return size;
    }

    public void setShipUnloadedBoolean(boolean shipUnloaded) {
        this.shipUnloaded = shipUnloaded;
    }

    public boolean ShipUnloaded() {
        return shipUnloaded;
    }

    public void setShipLoadedBoolean(boolean shipLoaded) {
        this.shipLoaded = shipLoaded;
    }

    public boolean ShipLoaded() {
        return shipLoaded;
    }
}

