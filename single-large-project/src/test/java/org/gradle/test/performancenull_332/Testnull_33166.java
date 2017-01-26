package org.gradle.test.performancenull_332;

import static org.junit.Assert.*;

public class Testnull_33166 {
    private final Productionnull_33166 production = new Productionnull_33166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}