package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47965 {
    private final Productionnull_47965 production = new Productionnull_47965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}