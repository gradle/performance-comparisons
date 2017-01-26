package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34908 {
    private final Productionnull_34908 production = new Productionnull_34908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}