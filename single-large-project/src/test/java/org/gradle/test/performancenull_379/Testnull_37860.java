package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37860 {
    private final Productionnull_37860 production = new Productionnull_37860("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}