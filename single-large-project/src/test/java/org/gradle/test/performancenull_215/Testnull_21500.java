package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21500 {
    private final Productionnull_21500 production = new Productionnull_21500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}