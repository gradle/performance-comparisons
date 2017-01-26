package org.gradle.test.performancenull_85;

import static org.junit.Assert.*;

public class Testnull_8482 {
    private final Productionnull_8482 production = new Productionnull_8482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}