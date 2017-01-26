package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38490 {
    private final Productionnull_38490 production = new Productionnull_38490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}