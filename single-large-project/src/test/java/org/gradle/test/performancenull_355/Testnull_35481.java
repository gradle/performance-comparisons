package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35481 {
    private final Productionnull_35481 production = new Productionnull_35481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}