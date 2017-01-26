package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30126 {
    private final Productionnull_30126 production = new Productionnull_30126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}