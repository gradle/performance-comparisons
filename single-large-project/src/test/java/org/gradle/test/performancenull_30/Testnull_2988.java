package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2988 {
    private final Productionnull_2988 production = new Productionnull_2988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}