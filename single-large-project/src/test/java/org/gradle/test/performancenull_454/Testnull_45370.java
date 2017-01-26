package org.gradle.test.performancenull_454;

import static org.junit.Assert.*;

public class Testnull_45370 {
    private final Productionnull_45370 production = new Productionnull_45370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}