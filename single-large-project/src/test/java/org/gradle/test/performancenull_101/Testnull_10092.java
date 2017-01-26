package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10092 {
    private final Productionnull_10092 production = new Productionnull_10092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}