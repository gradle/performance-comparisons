package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1706 {
    private final Productionnull_1706 production = new Productionnull_1706("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}