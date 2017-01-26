package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1083 {
    private final Productionnull_1083 production = new Productionnull_1083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}