package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31081 {
    private final Productionnull_31081 production = new Productionnull_31081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}