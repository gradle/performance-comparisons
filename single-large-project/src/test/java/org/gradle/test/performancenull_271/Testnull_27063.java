package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27063 {
    private final Productionnull_27063 production = new Productionnull_27063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}