package org.gradle.test.performancenull_90;

import static org.junit.Assert.*;

public class Testnull_8963 {
    private final Productionnull_8963 production = new Productionnull_8963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}