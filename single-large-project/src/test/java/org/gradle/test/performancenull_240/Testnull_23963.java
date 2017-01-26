package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23963 {
    private final Productionnull_23963 production = new Productionnull_23963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}