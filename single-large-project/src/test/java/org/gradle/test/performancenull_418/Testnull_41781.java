package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41781 {
    private final Productionnull_41781 production = new Productionnull_41781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}