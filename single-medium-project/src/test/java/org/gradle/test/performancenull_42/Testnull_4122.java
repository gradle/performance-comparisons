package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4122 {
    private final Productionnull_4122 production = new Productionnull_4122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}