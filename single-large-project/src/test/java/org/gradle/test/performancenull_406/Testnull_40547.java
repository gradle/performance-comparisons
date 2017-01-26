package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40547 {
    private final Productionnull_40547 production = new Productionnull_40547("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}