package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36384 {
    private final Productionnull_36384 production = new Productionnull_36384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}