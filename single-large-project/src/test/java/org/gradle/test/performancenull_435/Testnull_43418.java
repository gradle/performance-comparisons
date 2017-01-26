package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43418 {
    private final Productionnull_43418 production = new Productionnull_43418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}