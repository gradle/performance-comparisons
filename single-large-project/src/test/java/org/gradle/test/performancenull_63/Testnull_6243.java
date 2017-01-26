package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6243 {
    private final Productionnull_6243 production = new Productionnull_6243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}