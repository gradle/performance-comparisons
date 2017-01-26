package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46156 {
    private final Productionnull_46156 production = new Productionnull_46156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}