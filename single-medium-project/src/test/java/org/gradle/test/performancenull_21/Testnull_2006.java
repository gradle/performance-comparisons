package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2006 {
    private final Productionnull_2006 production = new Productionnull_2006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}