package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40563 {
    private final Productionnull_40563 production = new Productionnull_40563("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}