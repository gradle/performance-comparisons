package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16081 {
    private final Productionnull_16081 production = new Productionnull_16081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}