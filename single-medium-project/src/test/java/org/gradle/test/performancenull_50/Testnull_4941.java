package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4941 {
    private final Productionnull_4941 production = new Productionnull_4941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}