package org.gradle.test.performancenull_184;

import static org.junit.Assert.*;

public class Testnull_18348 {
    private final Productionnull_18348 production = new Productionnull_18348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}