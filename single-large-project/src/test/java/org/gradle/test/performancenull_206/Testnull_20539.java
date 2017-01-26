package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20539 {
    private final Productionnull_20539 production = new Productionnull_20539("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}