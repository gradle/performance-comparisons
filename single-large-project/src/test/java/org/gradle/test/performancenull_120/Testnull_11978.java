package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11978 {
    private final Productionnull_11978 production = new Productionnull_11978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}