package org.launchcode.java.demos.lsn6inheritance;

public class Main extends HouseCat {
    HouseCat garfield = new HouseCat("Garfield", 12);

    public Main(String aName) {
        super(aName);
    }

    public Main(String aName, double aWeight) {
        super(aName, aWeight);
    }

}
