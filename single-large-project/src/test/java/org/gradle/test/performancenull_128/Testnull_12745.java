package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12745 {
    private final Productionnull_12745 production = new Productionnull_12745("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}