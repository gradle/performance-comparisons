package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37862 {
    private final Productionnull_37862 production = new Productionnull_37862("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}