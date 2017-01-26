package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40501 {
    private final Productionnull_40501 production = new Productionnull_40501("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}