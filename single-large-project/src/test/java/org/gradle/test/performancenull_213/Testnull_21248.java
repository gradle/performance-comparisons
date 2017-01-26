package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21248 {
    private final Productionnull_21248 production = new Productionnull_21248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}