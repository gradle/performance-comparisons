package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41786 {
    private final Productionnull_41786 production = new Productionnull_41786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}