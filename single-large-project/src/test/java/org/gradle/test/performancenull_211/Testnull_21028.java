package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21028 {
    private final Productionnull_21028 production = new Productionnull_21028("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}