package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10035 {
    private final Productionnull_10035 production = new Productionnull_10035("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}