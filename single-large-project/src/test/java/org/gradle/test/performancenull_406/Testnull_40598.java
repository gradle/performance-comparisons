package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40598 {
    private final Productionnull_40598 production = new Productionnull_40598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}