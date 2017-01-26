package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10059 {
    private final Productionnull_10059 production = new Productionnull_10059("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}