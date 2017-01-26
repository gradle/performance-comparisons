package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22070 {
    private final Productionnull_22070 production = new Productionnull_22070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}