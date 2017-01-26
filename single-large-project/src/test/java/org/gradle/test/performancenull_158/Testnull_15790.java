package org.gradle.test.performancenull_158;

import static org.junit.Assert.*;

public class Testnull_15790 {
    private final Productionnull_15790 production = new Productionnull_15790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}