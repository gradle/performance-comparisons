package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10067 {
    private final Productionnull_10067 production = new Productionnull_10067("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}