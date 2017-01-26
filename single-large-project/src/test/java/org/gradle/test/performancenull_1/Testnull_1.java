package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_1 {
    private final Productionnull_1 production = new Productionnull_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}