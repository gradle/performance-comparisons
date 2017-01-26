package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21931 {
    private final Productionnull_21931 production = new Productionnull_21931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}