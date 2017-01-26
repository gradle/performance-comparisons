package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9868 {
    private final Productionnull_9868 production = new Productionnull_9868("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}