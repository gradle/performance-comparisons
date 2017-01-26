package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28007 {
    private final Productionnull_28007 production = new Productionnull_28007("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}