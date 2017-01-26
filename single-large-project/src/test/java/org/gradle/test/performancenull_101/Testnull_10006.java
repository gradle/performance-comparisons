package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10006 {
    private final Productionnull_10006 production = new Productionnull_10006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}