package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8007 {
    private final Productionnull_8007 production = new Productionnull_8007("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}