package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42606 {
    private final Productionnull_42606 production = new Productionnull_42606("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}