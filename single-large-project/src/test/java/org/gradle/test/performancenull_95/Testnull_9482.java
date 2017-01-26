package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9482 {
    private final Productionnull_9482 production = new Productionnull_9482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}