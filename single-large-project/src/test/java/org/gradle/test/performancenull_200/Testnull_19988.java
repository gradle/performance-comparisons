package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19988 {
    private final Productionnull_19988 production = new Productionnull_19988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}