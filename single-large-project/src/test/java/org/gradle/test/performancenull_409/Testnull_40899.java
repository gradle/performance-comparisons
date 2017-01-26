package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40899 {
    private final Productionnull_40899 production = new Productionnull_40899("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}