package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4968 {
    private final Productionnull_4968 production = new Productionnull_4968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}