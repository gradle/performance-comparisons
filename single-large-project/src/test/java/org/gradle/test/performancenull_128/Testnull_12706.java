package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12706 {
    private final Productionnull_12706 production = new Productionnull_12706("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}