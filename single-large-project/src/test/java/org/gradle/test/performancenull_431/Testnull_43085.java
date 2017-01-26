package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43085 {
    private final Productionnull_43085 production = new Productionnull_43085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}