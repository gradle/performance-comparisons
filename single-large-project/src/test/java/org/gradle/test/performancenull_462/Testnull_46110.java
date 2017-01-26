package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46110 {
    private final Productionnull_46110 production = new Productionnull_46110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}