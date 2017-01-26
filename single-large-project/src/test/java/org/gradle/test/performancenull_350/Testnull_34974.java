package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34974 {
    private final Productionnull_34974 production = new Productionnull_34974("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}