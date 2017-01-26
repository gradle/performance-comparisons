package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42471 {
    private final Productionnull_42471 production = new Productionnull_42471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}