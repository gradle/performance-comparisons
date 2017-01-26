package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40566 {
    private final Productionnull_40566 production = new Productionnull_40566("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}