package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46006 {
    private final Productionnull_46006 production = new Productionnull_46006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}