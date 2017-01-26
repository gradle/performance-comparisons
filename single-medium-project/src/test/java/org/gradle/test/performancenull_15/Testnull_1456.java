package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1456 {
    private final Productionnull_1456 production = new Productionnull_1456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}