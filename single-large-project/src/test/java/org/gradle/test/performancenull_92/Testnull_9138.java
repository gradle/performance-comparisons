package org.gradle.test.performancenull_92;

import static org.junit.Assert.*;

public class Testnull_9138 {
    private final Productionnull_9138 production = new Productionnull_9138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}