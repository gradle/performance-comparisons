package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21094 {
    private final Productionnull_21094 production = new Productionnull_21094("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}