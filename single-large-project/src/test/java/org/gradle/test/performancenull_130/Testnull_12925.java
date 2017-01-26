package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12925 {
    private final Productionnull_12925 production = new Productionnull_12925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}