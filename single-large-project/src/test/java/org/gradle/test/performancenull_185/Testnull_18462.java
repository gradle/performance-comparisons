package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18462 {
    private final Productionnull_18462 production = new Productionnull_18462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}