package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40580 {
    private final Productionnull_40580 production = new Productionnull_40580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}