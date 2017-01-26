package org.gradle.test.performancenull_10;

import static org.junit.Assert.*;

public class Testnull_978 {
    private final Productionnull_978 production = new Productionnull_978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}