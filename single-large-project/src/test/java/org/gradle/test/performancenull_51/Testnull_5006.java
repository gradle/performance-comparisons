package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5006 {
    private final Productionnull_5006 production = new Productionnull_5006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}