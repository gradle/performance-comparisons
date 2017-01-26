package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42870 {
    private final Productionnull_42870 production = new Productionnull_42870("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}