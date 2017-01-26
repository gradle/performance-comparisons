package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46098 {
    private final Productionnull_46098 production = new Productionnull_46098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}