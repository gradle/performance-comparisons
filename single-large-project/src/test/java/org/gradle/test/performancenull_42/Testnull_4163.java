package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4163 {
    private final Productionnull_4163 production = new Productionnull_4163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}