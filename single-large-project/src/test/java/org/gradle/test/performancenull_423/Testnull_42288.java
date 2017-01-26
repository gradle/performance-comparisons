package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42288 {
    private final Productionnull_42288 production = new Productionnull_42288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}