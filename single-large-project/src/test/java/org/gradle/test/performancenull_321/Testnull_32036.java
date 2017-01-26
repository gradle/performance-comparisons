package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32036 {
    private final Productionnull_32036 production = new Productionnull_32036("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}