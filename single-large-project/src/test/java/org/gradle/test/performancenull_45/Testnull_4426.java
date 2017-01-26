package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4426 {
    private final Productionnull_4426 production = new Productionnull_4426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}