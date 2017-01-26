package org.gradle.test.performancenull_273;

import static org.junit.Assert.*;

public class Testnull_27266 {
    private final Productionnull_27266 production = new Productionnull_27266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}