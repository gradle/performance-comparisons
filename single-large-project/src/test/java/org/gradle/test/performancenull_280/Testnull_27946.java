package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27946 {
    private final Productionnull_27946 production = new Productionnull_27946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}