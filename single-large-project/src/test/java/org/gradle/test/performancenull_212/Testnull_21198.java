package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21198 {
    private final Productionnull_21198 production = new Productionnull_21198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}