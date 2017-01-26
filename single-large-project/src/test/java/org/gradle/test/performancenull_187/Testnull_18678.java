package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18678 {
    private final Productionnull_18678 production = new Productionnull_18678("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}