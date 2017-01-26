package org.gradle.test.performancenull_359;

import static org.junit.Assert.*;

public class Testnull_35803 {
    private final Productionnull_35803 production = new Productionnull_35803("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}