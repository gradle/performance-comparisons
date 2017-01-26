package org.gradle.test.performancenull_237;

import static org.junit.Assert.*;

public class Testnull_23698 {
    private final Productionnull_23698 production = new Productionnull_23698("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}