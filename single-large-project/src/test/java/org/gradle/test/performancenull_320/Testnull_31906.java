package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31906 {
    private final Productionnull_31906 production = new Productionnull_31906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}