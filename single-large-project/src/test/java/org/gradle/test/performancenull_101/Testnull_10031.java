package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10031 {
    private final Productionnull_10031 production = new Productionnull_10031("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}