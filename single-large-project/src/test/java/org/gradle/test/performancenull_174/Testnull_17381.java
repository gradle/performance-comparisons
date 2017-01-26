package org.gradle.test.performancenull_174;

import static org.junit.Assert.*;

public class Testnull_17381 {
    private final Productionnull_17381 production = new Productionnull_17381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}