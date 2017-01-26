package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9429 {
    private final Productionnull_9429 production = new Productionnull_9429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}