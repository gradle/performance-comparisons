package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24997 {
    private final Productionnull_24997 production = new Productionnull_24997("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}