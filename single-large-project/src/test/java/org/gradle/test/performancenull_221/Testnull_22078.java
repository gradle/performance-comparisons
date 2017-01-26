package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22078 {
    private final Productionnull_22078 production = new Productionnull_22078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}