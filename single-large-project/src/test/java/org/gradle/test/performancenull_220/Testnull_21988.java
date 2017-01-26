package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21988 {
    private final Productionnull_21988 production = new Productionnull_21988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}