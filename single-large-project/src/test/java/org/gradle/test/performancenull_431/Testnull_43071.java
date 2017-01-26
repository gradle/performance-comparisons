package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43071 {
    private final Productionnull_43071 production = new Productionnull_43071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}