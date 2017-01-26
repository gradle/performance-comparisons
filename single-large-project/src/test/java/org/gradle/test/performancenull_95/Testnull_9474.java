package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9474 {
    private final Productionnull_9474 production = new Productionnull_9474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}