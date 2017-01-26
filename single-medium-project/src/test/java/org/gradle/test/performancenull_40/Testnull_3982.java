package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3982 {
    private final Productionnull_3982 production = new Productionnull_3982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}