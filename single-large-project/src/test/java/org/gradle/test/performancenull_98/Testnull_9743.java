package org.gradle.test.performancenull_98;

import static org.junit.Assert.*;

public class Testnull_9743 {
    private final Productionnull_9743 production = new Productionnull_9743("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}