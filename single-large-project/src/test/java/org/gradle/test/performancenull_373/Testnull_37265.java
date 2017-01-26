package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37265 {
    private final Productionnull_37265 production = new Productionnull_37265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}