package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2001 {
    private final Productionnull_2001 production = new Productionnull_2001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}