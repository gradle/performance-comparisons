package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42057 {
    private final Productionnull_42057 production = new Productionnull_42057("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}