package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32619 {
    private final Productionnull_32619 production = new Productionnull_32619("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}