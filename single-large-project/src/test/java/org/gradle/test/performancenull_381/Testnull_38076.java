package org.gradle.test.performancenull_381;

import static org.junit.Assert.*;

public class Testnull_38076 {
    private final Productionnull_38076 production = new Productionnull_38076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}