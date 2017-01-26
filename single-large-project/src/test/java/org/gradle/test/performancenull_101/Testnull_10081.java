package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10081 {
    private final Productionnull_10081 production = new Productionnull_10081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}