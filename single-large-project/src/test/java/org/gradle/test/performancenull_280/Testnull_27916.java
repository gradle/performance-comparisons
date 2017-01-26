package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27916 {
    private final Productionnull_27916 production = new Productionnull_27916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}