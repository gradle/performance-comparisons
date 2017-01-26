package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38468 {
    private final Productionnull_38468 production = new Productionnull_38468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}