package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4051 {
    private final Productionnull_4051 production = new Productionnull_4051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}