package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27446 {
    private final Productionnull_27446 production = new Productionnull_27446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}