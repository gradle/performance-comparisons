package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49956 {
    private final Productionnull_49956 production = new Productionnull_49956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}