package org.gradle.test.performancenull_352;

import static org.junit.Assert.*;

public class Testnull_35169 {
    private final Productionnull_35169 production = new Productionnull_35169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}