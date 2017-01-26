package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23789 {
    private final Productionnull_23789 production = new Productionnull_23789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}