package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10007 {
    private final Productionnull_10007 production = new Productionnull_10007("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}