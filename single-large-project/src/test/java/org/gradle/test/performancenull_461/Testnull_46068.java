package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46068 {
    private final Productionnull_46068 production = new Productionnull_46068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}