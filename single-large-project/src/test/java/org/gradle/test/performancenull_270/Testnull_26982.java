package org.gradle.test.performancenull_270;

import static org.junit.Assert.*;

public class Testnull_26982 {
    private final Productionnull_26982 production = new Productionnull_26982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}