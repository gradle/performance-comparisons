package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2098 {
    private final Productionnull_2098 production = new Productionnull_2098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}