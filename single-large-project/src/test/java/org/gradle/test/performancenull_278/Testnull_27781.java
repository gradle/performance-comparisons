package org.gradle.test.performancenull_278;

import static org.junit.Assert.*;

public class Testnull_27781 {
    private final Productionnull_27781 production = new Productionnull_27781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}