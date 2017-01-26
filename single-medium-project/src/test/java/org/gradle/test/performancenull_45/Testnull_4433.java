package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4433 {
    private final Productionnull_4433 production = new Productionnull_4433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}