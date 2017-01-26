package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25433 {
    private final Productionnull_25433 production = new Productionnull_25433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}