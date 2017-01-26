package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41778 {
    private final Productionnull_41778 production = new Productionnull_41778("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}