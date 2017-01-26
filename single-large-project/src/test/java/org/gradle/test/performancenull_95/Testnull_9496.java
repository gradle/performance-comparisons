package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9496 {
    private final Productionnull_9496 production = new Productionnull_9496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}