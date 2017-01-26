package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7988 {
    private final Productionnull_7988 production = new Productionnull_7988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}