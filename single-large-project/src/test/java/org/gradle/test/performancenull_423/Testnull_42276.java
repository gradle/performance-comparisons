package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42276 {
    private final Productionnull_42276 production = new Productionnull_42276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}