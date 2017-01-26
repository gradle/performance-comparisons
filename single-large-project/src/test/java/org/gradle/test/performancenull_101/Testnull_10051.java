package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10051 {
    private final Productionnull_10051 production = new Productionnull_10051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}