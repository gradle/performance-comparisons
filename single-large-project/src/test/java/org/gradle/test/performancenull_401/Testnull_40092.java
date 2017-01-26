package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40092 {
    private final Productionnull_40092 production = new Productionnull_40092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}