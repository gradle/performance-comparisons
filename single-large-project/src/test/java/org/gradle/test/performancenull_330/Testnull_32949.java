package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32949 {
    private final Productionnull_32949 production = new Productionnull_32949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}