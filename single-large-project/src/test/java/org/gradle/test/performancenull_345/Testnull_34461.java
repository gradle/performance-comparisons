package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34461 {
    private final Productionnull_34461 production = new Productionnull_34461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}