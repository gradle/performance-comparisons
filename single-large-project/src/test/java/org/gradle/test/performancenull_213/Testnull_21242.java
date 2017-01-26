package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21242 {
    private final Productionnull_21242 production = new Productionnull_21242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}