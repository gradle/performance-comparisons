package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4899 {
    private final Productionnull_4899 production = new Productionnull_4899("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}