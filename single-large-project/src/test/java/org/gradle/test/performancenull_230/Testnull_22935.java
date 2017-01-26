package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22935 {
    private final Productionnull_22935 production = new Productionnull_22935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}