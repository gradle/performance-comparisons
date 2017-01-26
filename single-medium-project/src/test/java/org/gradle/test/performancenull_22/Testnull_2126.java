package org.gradle.test.performancenull_22;

import static org.junit.Assert.*;

public class Testnull_2126 {
    private final Productionnull_2126 production = new Productionnull_2126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}