package org.gradle.test.performancenull_54;

import static org.junit.Assert.*;

public class Testnull_5384 {
    private final Productionnull_5384 production = new Productionnull_5384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}