package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4165 {
    private final Productionnull_4165 production = new Productionnull_4165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}