package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22979 {
    private final Productionnull_22979 production = new Productionnull_22979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}