package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4121 {
    private final Productionnull_4121 production = new Productionnull_4121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}