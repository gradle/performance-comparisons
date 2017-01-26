package org.gradle.test.performancenull_352;

import static org.junit.Assert.*;

public class Testnull_35199 {
    private final Productionnull_35199 production = new Productionnull_35199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}