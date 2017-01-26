package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1843 {
    private final Productionnull_1843 production = new Productionnull_1843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}