package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4743 {
    private final Productionnull_4743 production = new Productionnull_4743("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}