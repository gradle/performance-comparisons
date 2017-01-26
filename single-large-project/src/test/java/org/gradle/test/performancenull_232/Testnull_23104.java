package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23104 {
    private final Productionnull_23104 production = new Productionnull_23104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}