package org.gradle.test.performancenull_332;

import static org.junit.Assert.*;

public class Testnull_33186 {
    private final Productionnull_33186 production = new Productionnull_33186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}