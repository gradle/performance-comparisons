package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_104 {
    private final Productionnull_104 production = new Productionnull_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}