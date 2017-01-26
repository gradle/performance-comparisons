package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7489 {
    private final Productionnull_7489 production = new Productionnull_7489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}