package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4151 {
    private final Productionnull_4151 production = new Productionnull_4151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}