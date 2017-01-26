package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40837 {
    private final Productionnull_40837 production = new Productionnull_40837("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}