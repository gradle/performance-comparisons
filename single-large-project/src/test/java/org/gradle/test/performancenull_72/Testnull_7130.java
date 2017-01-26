package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7130 {
    private final Productionnull_7130 production = new Productionnull_7130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}