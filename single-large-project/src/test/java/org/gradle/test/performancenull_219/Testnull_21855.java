package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21855 {
    private final Productionnull_21855 production = new Productionnull_21855("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}