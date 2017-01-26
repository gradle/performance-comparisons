package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38461 {
    private final Productionnull_38461 production = new Productionnull_38461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}