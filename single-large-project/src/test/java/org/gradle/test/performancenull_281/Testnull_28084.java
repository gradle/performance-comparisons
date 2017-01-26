package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28084 {
    private final Productionnull_28084 production = new Productionnull_28084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}