package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2086 {
    private final Productionnull_2086 production = new Productionnull_2086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}