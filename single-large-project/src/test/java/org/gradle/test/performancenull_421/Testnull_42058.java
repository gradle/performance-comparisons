package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42058 {
    private final Productionnull_42058 production = new Productionnull_42058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}