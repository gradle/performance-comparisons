package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21400 {
    private final Productionnull_21400 production = new Productionnull_21400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}