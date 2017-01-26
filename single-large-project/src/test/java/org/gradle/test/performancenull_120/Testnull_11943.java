package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11943 {
    private final Productionnull_11943 production = new Productionnull_11943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}