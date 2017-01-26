package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9432 {
    private final Productionnull_9432 production = new Productionnull_9432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}