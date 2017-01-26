package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21396 {
    private final Productionnull_21396 production = new Productionnull_21396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}