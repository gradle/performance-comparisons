package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17059 {
    private final Productionnull_17059 production = new Productionnull_17059("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}