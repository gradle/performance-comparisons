package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_2 {
    private final Productionnull_2 production = new Productionnull_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}