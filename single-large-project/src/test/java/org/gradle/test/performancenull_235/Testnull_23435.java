package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23435 {
    private final Productionnull_23435 production = new Productionnull_23435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}