package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2443 {
    private final Productionnull_2443 production = new Productionnull_2443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}