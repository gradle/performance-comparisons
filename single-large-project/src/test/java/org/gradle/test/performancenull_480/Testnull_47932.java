package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47932 {
    private final Productionnull_47932 production = new Productionnull_47932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}