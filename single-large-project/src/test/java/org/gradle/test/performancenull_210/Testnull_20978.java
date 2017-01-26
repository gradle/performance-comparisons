package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20978 {
    private final Productionnull_20978 production = new Productionnull_20978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}