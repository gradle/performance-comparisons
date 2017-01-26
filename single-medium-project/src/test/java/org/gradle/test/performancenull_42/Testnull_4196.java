package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4196 {
    private final Productionnull_4196 production = new Productionnull_4196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}