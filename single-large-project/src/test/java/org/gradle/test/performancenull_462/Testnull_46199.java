package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46199 {
    private final Productionnull_46199 production = new Productionnull_46199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}