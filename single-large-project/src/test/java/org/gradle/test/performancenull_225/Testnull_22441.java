package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22441 {
    private final Productionnull_22441 production = new Productionnull_22441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}