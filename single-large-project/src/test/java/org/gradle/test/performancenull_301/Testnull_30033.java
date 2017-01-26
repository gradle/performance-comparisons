package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30033 {
    private final Productionnull_30033 production = new Productionnull_30033("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}