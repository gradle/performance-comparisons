package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37802 {
    private final Productionnull_37802 production = new Productionnull_37802("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}