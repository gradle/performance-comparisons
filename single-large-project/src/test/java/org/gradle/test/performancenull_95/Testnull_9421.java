package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9421 {
    private final Productionnull_9421 production = new Productionnull_9421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}