package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4130 {
    private final Productionnull_4130 production = new Productionnull_4130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}