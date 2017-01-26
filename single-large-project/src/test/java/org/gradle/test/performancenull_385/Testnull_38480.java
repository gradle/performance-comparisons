package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38480 {
    private final Productionnull_38480 production = new Productionnull_38480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}