package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37263 {
    private final Productionnull_37263 production = new Productionnull_37263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}