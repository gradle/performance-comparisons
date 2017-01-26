package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22097 {
    private final Productionnull_22097 production = new Productionnull_22097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}