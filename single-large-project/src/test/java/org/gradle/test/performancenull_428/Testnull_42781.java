package org.gradle.test.performancenull_428;

import static org.junit.Assert.*;

public class Testnull_42781 {
    private final Productionnull_42781 production = new Productionnull_42781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}