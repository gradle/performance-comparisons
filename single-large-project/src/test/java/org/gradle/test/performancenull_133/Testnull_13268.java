package org.gradle.test.performancenull_133;

import static org.junit.Assert.*;

public class Testnull_13268 {
    private final Productionnull_13268 production = new Productionnull_13268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}