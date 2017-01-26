package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21749 {
    private final Productionnull_21749 production = new Productionnull_21749("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}