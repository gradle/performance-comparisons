package org.gradle.test.performancenull_93;

import static org.junit.Assert.*;

public class Testnull_9262 {
    private final Productionnull_9262 production = new Productionnull_9262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}