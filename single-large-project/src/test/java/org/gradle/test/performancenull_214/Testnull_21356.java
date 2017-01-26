package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21356 {
    private final Productionnull_21356 production = new Productionnull_21356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}