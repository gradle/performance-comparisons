package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32672 {
    private final Productionnull_32672 production = new Productionnull_32672("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}