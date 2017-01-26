package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34280 {
    private final Productionnull_34280 production = new Productionnull_34280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}