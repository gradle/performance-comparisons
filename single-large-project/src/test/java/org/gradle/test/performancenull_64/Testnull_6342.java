package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6342 {
    private final Productionnull_6342 production = new Productionnull_6342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}