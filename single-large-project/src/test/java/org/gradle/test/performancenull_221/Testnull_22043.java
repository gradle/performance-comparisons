package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22043 {
    private final Productionnull_22043 production = new Productionnull_22043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}