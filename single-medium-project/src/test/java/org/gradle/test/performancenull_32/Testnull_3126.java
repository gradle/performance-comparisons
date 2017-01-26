package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3126 {
    private final Productionnull_3126 production = new Productionnull_3126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}