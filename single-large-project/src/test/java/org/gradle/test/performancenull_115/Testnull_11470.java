package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11470 {
    private final Productionnull_11470 production = new Productionnull_11470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}