package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17488 {
    private final Productionnull_17488 production = new Productionnull_17488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}