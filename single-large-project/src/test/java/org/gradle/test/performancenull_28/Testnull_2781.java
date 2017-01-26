package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2781 {
    private final Productionnull_2781 production = new Productionnull_2781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}