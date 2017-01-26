package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21039 {
    private final Productionnull_21039 production = new Productionnull_21039("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}