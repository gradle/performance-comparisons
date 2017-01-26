package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2703 {
    private final Productionnull_2703 production = new Productionnull_2703("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}