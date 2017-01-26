package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22059 {
    private final Productionnull_22059 production = new Productionnull_22059("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}