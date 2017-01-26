package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31043 {
    private final Productionnull_31043 production = new Productionnull_31043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}