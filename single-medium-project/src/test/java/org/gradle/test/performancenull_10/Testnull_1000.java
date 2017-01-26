package org.gradle.test.performancenull_10;

import static org.junit.Assert.*;

public class Testnull_1000 {
    private final Productionnull_1000 production = new Productionnull_1000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}