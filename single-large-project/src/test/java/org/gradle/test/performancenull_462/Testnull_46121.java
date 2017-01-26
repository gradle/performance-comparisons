package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46121 {
    private final Productionnull_46121 production = new Productionnull_46121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}