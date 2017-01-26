package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40096 {
    private final Productionnull_40096 production = new Productionnull_40096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}