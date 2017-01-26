package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11974 {
    private final Productionnull_11974 production = new Productionnull_11974("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}