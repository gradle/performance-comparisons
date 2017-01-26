package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2706 {
    private final Productionnull_2706 production = new Productionnull_2706("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}