package org.gradle.test.performancenull_428;

import static org.junit.Assert.*;

public class Testnull_42769 {
    private final Productionnull_42769 production = new Productionnull_42769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}