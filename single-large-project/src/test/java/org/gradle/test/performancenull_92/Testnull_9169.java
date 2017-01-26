package org.gradle.test.performancenull_92;

import static org.junit.Assert.*;

public class Testnull_9169 {
    private final Productionnull_9169 production = new Productionnull_9169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}