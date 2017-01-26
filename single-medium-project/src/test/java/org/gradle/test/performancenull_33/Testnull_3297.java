package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3297 {
    private final Productionnull_3297 production = new Productionnull_3297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}