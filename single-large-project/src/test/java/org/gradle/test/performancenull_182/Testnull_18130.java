package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18130 {
    private final Productionnull_18130 production = new Productionnull_18130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}