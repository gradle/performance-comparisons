package org.gradle.test.performancenull_5;

import static org.junit.Assert.*;

public class Testnull_492 {
    private final Productionnull_492 production = new Productionnull_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}