package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27967 {
    private final Productionnull_27967 production = new Productionnull_27967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}