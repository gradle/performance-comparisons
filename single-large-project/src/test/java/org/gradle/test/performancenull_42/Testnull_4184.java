package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4184 {
    private final Productionnull_4184 production = new Productionnull_4184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}