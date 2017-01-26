package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2083 {
    private final Productionnull_2083 production = new Productionnull_2083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}