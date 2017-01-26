package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6350 {
    private final Productionnull_6350 production = new Productionnull_6350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}