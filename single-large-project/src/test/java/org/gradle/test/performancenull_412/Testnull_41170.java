package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41170 {
    private final Productionnull_41170 production = new Productionnull_41170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}