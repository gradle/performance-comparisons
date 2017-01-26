package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24104 {
    private final Productionnull_24104 production = new Productionnull_24104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}