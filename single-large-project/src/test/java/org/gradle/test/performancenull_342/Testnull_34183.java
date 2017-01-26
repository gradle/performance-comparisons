package org.gradle.test.performancenull_342;

import static org.junit.Assert.*;

public class Testnull_34183 {
    private final Productionnull_34183 production = new Productionnull_34183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}