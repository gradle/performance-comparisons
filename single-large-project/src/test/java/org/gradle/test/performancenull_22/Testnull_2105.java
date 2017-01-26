package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2105 {
    private final Productionnull_2105 production = new Productionnull_2105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}