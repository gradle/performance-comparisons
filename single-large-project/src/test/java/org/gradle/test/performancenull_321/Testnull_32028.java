package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32028 {
    private final Productionnull_32028 production = new Productionnull_32028("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}