package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47906 {
    private final Productionnull_47906 production = new Productionnull_47906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}