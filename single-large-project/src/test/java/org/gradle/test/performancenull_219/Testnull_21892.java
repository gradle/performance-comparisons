package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21892 {
    private final Productionnull_21892 production = new Productionnull_21892("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}