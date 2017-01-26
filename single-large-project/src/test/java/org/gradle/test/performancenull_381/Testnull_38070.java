package org.gradle.test.performancenull_381;

import static org.junit.Assert.*;

public class Testnull_38070 {
    private final Productionnull_38070 production = new Productionnull_38070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}