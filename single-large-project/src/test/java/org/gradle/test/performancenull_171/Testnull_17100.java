package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17100 {
    private final Productionnull_17100 production = new Productionnull_17100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}