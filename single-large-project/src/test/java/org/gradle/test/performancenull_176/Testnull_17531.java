package org.gradle.test.performancenull_176;

import static org.junit.Assert.*;

public class Testnull_17531 {
    private final Productionnull_17531 production = new Productionnull_17531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}