package org.gradle.test.performancenull_352;

import static org.junit.Assert.*;

public class Testnull_35173 {
    private final Productionnull_35173 production = new Productionnull_35173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}