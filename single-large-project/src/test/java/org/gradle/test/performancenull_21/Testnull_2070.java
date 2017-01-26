package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2070 {
    private final Productionnull_2070 production = new Productionnull_2070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}