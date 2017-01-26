package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4246 {
    private final Productionnull_4246 production = new Productionnull_4246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}