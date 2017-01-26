package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18149 {
    private final Productionnull_18149 production = new Productionnull_18149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}