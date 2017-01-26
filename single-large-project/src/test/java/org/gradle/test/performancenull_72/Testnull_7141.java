package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7141 {
    private final Productionnull_7141 production = new Productionnull_7141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}