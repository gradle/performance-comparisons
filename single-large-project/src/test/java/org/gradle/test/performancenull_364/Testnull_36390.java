package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36390 {
    private final Productionnull_36390 production = new Productionnull_36390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}