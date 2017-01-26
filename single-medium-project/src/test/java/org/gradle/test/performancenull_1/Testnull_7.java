package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_7 {
    private final Productionnull_7 production = new Productionnull_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}