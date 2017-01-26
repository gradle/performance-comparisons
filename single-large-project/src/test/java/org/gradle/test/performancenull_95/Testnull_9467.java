package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9467 {
    private final Productionnull_9467 production = new Productionnull_9467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}