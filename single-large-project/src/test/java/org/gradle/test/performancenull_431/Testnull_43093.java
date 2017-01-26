package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43093 {
    private final Productionnull_43093 production = new Productionnull_43093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}