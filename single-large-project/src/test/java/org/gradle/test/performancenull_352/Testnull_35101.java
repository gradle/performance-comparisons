package org.gradle.test.performancenull_352;

import static org.junit.Assert.*;

public class Testnull_35101 {
    private final Productionnull_35101 production = new Productionnull_35101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}