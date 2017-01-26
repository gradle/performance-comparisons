package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37827 {
    private final Productionnull_37827 production = new Productionnull_37827("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}