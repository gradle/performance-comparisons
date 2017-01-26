package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46004 {
    private final Productionnull_46004 production = new Productionnull_46004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}