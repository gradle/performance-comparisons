package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38421 {
    private final Productionnull_38421 production = new Productionnull_38421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}