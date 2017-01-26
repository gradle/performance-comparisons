package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6002 {
    private final Productionnull_6002 production = new Productionnull_6002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}