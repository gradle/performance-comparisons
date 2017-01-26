package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21135 {
    private final Productionnull_21135 production = new Productionnull_21135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}