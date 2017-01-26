package org.gradle.test.performancenull_4;

import static org.junit.Assert.*;

public class Testnull_302 {
    private final Productionnull_302 production = new Productionnull_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}