package org.gradle.test.performancenull_3;

import static org.junit.Assert.*;

public class Testnull_213 {
    private final Productionnull_213 production = new Productionnull_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}