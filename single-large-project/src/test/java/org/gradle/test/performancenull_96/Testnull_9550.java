package org.gradle.test.performancenull_96;

import static org.junit.Assert.*;

public class Testnull_9550 {
    private final Productionnull_9550 production = new Productionnull_9550("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}