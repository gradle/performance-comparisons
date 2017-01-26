package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22949 {
    private final Productionnull_22949 production = new Productionnull_22949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}