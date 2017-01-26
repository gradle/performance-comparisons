package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1103 {
    private final Productionnull_1103 production = new Productionnull_1103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}