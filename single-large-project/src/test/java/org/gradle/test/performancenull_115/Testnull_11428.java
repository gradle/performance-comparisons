package org.gradle.test.performancenull_115;

import static org.junit.Assert.*;

public class Testnull_11428 {
    private final Productionnull_11428 production = new Productionnull_11428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}