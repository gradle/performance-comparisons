package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38492 {
    private final Productionnull_38492 production = new Productionnull_38492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}