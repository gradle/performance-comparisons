package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32904 {
    private final Productionnull_32904 production = new Productionnull_32904("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}