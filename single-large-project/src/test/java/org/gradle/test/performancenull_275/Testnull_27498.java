package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27498 {
    private final Productionnull_27498 production = new Productionnull_27498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}