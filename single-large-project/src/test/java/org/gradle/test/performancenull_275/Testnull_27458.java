package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27458 {
    private final Productionnull_27458 production = new Productionnull_27458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}