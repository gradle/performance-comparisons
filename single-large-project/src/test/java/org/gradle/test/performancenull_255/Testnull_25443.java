package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25443 {
    private final Productionnull_25443 production = new Productionnull_25443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}