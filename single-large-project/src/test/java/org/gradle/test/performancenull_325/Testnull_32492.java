package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32492 {
    private final Productionnull_32492 production = new Productionnull_32492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}