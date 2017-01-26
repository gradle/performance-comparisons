package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48095 {
    private final Productionnull_48095 production = new Productionnull_48095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}