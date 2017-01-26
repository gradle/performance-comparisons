package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20968 {
    private final Productionnull_20968 production = new Productionnull_20968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}