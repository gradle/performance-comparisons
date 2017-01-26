package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47954 {
    private final Productionnull_47954 production = new Productionnull_47954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}