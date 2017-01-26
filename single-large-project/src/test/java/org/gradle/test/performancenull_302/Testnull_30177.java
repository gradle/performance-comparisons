package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30177 {
    private final Productionnull_30177 production = new Productionnull_30177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}