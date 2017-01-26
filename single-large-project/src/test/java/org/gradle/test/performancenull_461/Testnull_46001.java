package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46001 {
    private final Productionnull_46001 production = new Productionnull_46001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}