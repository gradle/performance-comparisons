package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43490 {
    private final Productionnull_43490 production = new Productionnull_43490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}