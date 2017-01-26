package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21949 {
    private final Productionnull_21949 production = new Productionnull_21949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}