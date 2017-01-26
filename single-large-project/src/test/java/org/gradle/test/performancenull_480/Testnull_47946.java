package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47946 {
    private final Productionnull_47946 production = new Productionnull_47946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}