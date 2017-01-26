package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46083 {
    private final Productionnull_46083 production = new Productionnull_46083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}