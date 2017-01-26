package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40862 {
    private final Productionnull_40862 production = new Productionnull_40862("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}