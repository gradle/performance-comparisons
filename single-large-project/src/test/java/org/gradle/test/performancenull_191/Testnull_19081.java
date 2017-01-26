package org.gradle.test.performancenull_191;

import static org.junit.Assert.*;

public class Testnull_19081 {
    private final Productionnull_19081 production = new Productionnull_19081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}