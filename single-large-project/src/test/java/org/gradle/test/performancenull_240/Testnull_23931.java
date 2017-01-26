package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23931 {
    private final Productionnull_23931 production = new Productionnull_23931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}