package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46002 {
    private final Productionnull_46002 production = new Productionnull_46002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}