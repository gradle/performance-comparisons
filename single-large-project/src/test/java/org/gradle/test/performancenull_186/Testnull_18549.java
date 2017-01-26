package org.gradle.test.performancenull_186;

import static org.junit.Assert.*;

public class Testnull_18549 {
    private final Productionnull_18549 production = new Productionnull_18549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}