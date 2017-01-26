package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49175 {
    private final Productionnull_49175 production = new Productionnull_49175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}