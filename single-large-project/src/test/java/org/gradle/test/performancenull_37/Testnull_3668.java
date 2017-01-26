package org.gradle.test.performancenull_37;

import static org.junit.Assert.*;

public class Testnull_3668 {
    private final Productionnull_3668 production = new Productionnull_3668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}