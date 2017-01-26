package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6283 {
    private final Productionnull_6283 production = new Productionnull_6283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}