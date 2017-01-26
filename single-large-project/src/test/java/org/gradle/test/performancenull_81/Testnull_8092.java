package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8092 {
    private final Productionnull_8092 production = new Productionnull_8092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}