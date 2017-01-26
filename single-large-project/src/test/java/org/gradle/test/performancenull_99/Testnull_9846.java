package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9846 {
    private final Productionnull_9846 production = new Productionnull_9846("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}