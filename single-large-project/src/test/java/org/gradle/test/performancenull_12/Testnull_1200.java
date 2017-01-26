package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1200 {
    private final Productionnull_1200 production = new Productionnull_1200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}