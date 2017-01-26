package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40838 {
    private final Productionnull_40838 production = new Productionnull_40838("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}