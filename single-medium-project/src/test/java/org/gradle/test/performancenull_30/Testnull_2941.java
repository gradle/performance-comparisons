package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2941 {
    private final Productionnull_2941 production = new Productionnull_2941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}