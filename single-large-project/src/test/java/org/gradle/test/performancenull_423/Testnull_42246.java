package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42246 {
    private final Productionnull_42246 production = new Productionnull_42246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}