package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42913 {
    private final Productionnull_42913 production = new Productionnull_42913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}