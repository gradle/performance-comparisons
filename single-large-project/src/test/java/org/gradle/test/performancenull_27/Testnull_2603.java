package org.gradle.test.performancenull_27;

import static org.junit.Assert.*;

public class Testnull_2603 {
    private final Productionnull_2603 production = new Productionnull_2603("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}