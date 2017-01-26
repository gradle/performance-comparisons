package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24171 {
    private final Productionnull_24171 production = new Productionnull_24171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}