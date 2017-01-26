package org.gradle.test.performancenull_119;

import static org.junit.Assert.*;

public class Testnull_11860 {
    private final Productionnull_11860 production = new Productionnull_11860("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}