package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46093 {
    private final Productionnull_46093 production = new Productionnull_46093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}