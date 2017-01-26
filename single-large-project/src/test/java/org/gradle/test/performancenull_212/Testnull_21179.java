package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21179 {
    private final Productionnull_21179 production = new Productionnull_21179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}