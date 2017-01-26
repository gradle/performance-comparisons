package org.gradle.test.performancenull_27;

import static org.junit.Assert.*;

public class Testnull_2602 {
    private final Productionnull_2602 production = new Productionnull_2602("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}