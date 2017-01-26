package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43026 {
    private final Productionnull_43026 production = new Productionnull_43026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}