package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1002 {
    private final Productionnull_1002 production = new Productionnull_1002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}