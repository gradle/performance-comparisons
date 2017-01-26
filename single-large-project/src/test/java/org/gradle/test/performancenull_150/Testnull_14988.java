package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14988 {
    private final Productionnull_14988 production = new Productionnull_14988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}