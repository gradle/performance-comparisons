package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23735 {
    private final Productionnull_23735 production = new Productionnull_23735("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}