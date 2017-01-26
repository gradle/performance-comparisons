package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3200 {
    private final Productionnull_3200 production = new Productionnull_3200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}