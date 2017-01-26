package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46042 {
    private final Productionnull_46042 production = new Productionnull_46042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}