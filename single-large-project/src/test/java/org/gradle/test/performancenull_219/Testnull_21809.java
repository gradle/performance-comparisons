package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21809 {
    private final Productionnull_21809 production = new Productionnull_21809("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}