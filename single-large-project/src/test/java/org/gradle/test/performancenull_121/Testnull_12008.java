package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12008 {
    private final Productionnull_12008 production = new Productionnull_12008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}