package org.gradle.test.performancenull_70;

import static org.junit.Assert.*;

public class Testnull_6978 {
    private final Productionnull_6978 production = new Productionnull_6978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}