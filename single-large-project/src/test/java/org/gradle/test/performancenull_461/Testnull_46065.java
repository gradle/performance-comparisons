package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46065 {
    private final Productionnull_46065 production = new Productionnull_46065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}