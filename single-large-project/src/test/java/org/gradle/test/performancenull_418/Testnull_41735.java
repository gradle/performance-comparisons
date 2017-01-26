package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41735 {
    private final Productionnull_41735 production = new Productionnull_41735("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}