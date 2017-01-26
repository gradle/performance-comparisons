package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41793 {
    private final Productionnull_41793 production = new Productionnull_41793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}