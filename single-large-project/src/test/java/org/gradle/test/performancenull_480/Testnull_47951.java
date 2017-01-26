package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47951 {
    private final Productionnull_47951 production = new Productionnull_47951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}