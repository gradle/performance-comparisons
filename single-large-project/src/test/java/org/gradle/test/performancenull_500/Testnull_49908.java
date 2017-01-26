package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49908 {
    private final Productionnull_49908 production = new Productionnull_49908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}