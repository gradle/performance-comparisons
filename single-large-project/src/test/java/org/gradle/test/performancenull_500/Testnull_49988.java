package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49988 {
    private final Productionnull_49988 production = new Productionnull_49988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}