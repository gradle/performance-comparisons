package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_8 {
    private final Productionnull_8 production = new Productionnull_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}