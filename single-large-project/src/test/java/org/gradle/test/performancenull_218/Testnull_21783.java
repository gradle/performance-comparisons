package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21783 {
    private final Productionnull_21783 production = new Productionnull_21783("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}