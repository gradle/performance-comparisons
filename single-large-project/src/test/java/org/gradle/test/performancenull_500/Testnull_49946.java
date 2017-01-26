package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49946 {
    private final Productionnull_49946 production = new Productionnull_49946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}