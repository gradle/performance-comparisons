package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36706 {
    private final Productionnull_36706 production = new Productionnull_36706("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}