package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36325 {
    private final Productionnull_36325 production = new Productionnull_36325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}