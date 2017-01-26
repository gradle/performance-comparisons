package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38465 {
    private final Productionnull_38465 production = new Productionnull_38465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}