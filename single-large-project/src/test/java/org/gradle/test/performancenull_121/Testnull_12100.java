package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12100 {
    private final Productionnull_12100 production = new Productionnull_12100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}