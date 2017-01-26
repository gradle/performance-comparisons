package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4854 {
    private final Productionnull_4854 production = new Productionnull_4854("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}