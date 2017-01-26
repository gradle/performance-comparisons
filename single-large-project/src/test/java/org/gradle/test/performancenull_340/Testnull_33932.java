package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33932 {
    private final Productionnull_33932 production = new Productionnull_33932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}