package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31930 {
    private final Productionnull_31930 production = new Productionnull_31930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}