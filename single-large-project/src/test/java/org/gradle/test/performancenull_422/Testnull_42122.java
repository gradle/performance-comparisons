package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42122 {
    private final Productionnull_42122 production = new Productionnull_42122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}