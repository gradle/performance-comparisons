package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42826 {
    private final Productionnull_42826 production = new Productionnull_42826("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}