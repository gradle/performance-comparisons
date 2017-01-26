package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27901 {
    private final Productionnull_27901 production = new Productionnull_27901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}