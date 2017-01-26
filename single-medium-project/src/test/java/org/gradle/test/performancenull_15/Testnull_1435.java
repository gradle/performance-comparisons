package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1435 {
    private final Productionnull_1435 production = new Productionnull_1435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}