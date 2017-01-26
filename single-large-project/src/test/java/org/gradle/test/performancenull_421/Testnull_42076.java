package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42076 {
    private final Productionnull_42076 production = new Productionnull_42076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}