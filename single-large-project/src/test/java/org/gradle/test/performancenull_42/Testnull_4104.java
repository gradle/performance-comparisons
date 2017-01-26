package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4104 {
    private final Productionnull_4104 production = new Productionnull_4104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}