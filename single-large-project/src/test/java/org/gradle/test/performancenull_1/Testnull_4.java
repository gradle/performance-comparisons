package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_4 {
    private final Productionnull_4 production = new Productionnull_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}