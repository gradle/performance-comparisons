package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22099 {
    private final Productionnull_22099 production = new Productionnull_22099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}