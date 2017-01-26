package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7435 {
    private final Productionnull_7435 production = new Productionnull_7435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}