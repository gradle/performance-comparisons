package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46187 {
    private final Productionnull_46187 production = new Productionnull_46187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}