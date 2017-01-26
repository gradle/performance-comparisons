package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31187 {
    private final Productionnull_31187 production = new Productionnull_31187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}