package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21320 {
    private final Productionnull_21320 production = new Productionnull_21320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}