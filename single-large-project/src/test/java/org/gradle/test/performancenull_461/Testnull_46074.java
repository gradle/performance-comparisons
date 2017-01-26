package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46074 {
    private final Productionnull_46074 production = new Productionnull_46074("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}