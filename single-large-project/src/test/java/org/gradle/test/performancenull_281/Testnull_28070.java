package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28070 {
    private final Productionnull_28070 production = new Productionnull_28070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}