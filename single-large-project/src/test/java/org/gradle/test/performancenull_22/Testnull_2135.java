package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2135 {
    private final Productionnull_2135 production = new Productionnull_2135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}