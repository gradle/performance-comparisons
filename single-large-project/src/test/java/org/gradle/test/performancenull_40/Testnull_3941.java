package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3941 {
    private final Productionnull_3941 production = new Productionnull_3941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}