package org.gradle.test.performancenull_352;

import static org.junit.Assert.*;

public class Testnull_35190 {
    private final Productionnull_35190 production = new Productionnull_35190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}