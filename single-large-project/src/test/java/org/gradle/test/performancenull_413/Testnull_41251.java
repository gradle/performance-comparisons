package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41251 {
    private final Productionnull_41251 production = new Productionnull_41251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}