package org.gradle.test.performancenull_352;

import static org.junit.Assert.*;

public class Testnull_35200 {
    private final Productionnull_35200 production = new Productionnull_35200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}