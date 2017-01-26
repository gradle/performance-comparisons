package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37900 {
    private final Productionnull_37900 production = new Productionnull_37900("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}