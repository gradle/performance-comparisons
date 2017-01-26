package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23390 {
    private final Productionnull_23390 production = new Productionnull_23390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}