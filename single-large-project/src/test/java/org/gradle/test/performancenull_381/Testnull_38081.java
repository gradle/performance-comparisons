package org.gradle.test.performancenull_381;

import static org.junit.Assert.*;

public class Testnull_38081 {
    private final Productionnull_38081 production = new Productionnull_38081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}