package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37954 {
    private final Productionnull_37954 production = new Productionnull_37954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}