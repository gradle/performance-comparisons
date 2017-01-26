package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47265 {
    private final Productionnull_47265 production = new Productionnull_47265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}