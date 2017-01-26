package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36749 {
    private final Productionnull_36749 production = new Productionnull_36749("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}