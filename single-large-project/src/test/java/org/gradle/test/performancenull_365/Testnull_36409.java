package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36409 {
    private final Productionnull_36409 production = new Productionnull_36409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}