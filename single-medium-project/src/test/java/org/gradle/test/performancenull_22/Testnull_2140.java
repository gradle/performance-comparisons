package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2140 {
    private final Productionnull_2140 production = new Productionnull_2140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}