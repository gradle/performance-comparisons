package org.gradle.test.performancenull_209;

import static org.junit.Assert.*;

public class Testnull_20803 {
    private final Productionnull_20803 production = new Productionnull_20803("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}