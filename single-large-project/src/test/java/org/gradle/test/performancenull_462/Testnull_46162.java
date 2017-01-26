package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46162 {
    private final Productionnull_46162 production = new Productionnull_46162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}