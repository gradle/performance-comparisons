package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_154 {
    private final Productionnull_154 production = new Productionnull_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}