package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3531 {
    private final Productionnull_3531 production = new Productionnull_3531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}