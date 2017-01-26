package org.gradle.test.performancenull_424;

import static org.junit.Assert.*;

public class Testnull_42370 {
    private final Productionnull_42370 production = new Productionnull_42370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}