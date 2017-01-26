package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9470 {
    private final Productionnull_9470 production = new Productionnull_9470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}