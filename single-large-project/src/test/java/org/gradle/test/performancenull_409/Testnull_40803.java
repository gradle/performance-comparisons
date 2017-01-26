package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40803 {
    private final Productionnull_40803 production = new Productionnull_40803("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}