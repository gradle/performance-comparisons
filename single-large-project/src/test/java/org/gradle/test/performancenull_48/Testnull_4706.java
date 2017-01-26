package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4706 {
    private final Productionnull_4706 production = new Productionnull_4706("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}