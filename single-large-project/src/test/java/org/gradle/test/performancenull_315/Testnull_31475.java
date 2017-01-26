package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31475 {
    private final Productionnull_31475 production = new Productionnull_31475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}