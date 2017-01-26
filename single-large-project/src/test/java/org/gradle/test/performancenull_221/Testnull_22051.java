package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22051 {
    private final Productionnull_22051 production = new Productionnull_22051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}