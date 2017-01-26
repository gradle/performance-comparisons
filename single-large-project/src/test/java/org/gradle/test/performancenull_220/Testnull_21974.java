package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21974 {
    private final Productionnull_21974 production = new Productionnull_21974("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}